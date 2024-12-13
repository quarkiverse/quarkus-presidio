package io.quarkiverse.presidio.deployment;

import java.util.Map;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import io.quarkiverse.presidio.runtime.health.PresidioAnalyzerHealthCheck;
import io.quarkiverse.presidio.runtime.health.PresidioAnonymizerHealthCheck;
import io.quarkus.deployment.IsNormal;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.DevServicesResultBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.dev.devservices.GlobalDevServicesConfig;
import io.quarkus.smallrye.health.deployment.spi.HealthBuildItem;

class PresidioProcessor {

    private static final String FEATURE = "presidio";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep(onlyIfNot = IsNormal.class, onlyIf = GlobalDevServicesConfig.Enabled.class)
    public DevServicesResultBuildItem createAnalyzerContainer(PresidioDevServiceConfig config) {

        if (!config.enabledAnalyzer()) {
            return null;
        }

        DockerImageName dockerImageName = DockerImageName.parse(config.analyzerImageName());
        GenericContainer container = new GenericContainer<>(dockerImageName)
                .withExposedPorts(3000)
                .waitingFor(Wait.forLogMessage(".*" + "Running on all " + ".*", 1))
                .withReuse(config.anonymizerReuse());

        container.start();

        final String newUrl = "http://" + container.getHost() + ":" + container.getMappedPort(3000);

        final Map<String, String> configOverrides = Map.of("quarkus.rest-client.presidio-analyzer.url", newUrl);

        return new DevServicesResultBuildItem.RunningDevService(FEATURE + "-analyzer", container.getContainerId(),
                container::close, configOverrides)
                .toBuildItem();
    }

    @BuildStep(onlyIfNot = IsNormal.class, onlyIf = GlobalDevServicesConfig.Enabled.class)
    public DevServicesResultBuildItem createAnonymizerContainer(PresidioDevServiceConfig config) {

        if (!config.enabledAnonymizer()) {
            return null;
        }

        DockerImageName dockerImageName = DockerImageName.parse(config.anonymizerImageName());
        GenericContainer container = new GenericContainer<>(dockerImageName)
                .withExposedPorts(3000)
                .waitingFor(Wait.forLogMessage(".*" + "Running on all " + ".*", 1))
                .withReuse(config.anonymizerReuse());

        container.start();

        final String newUrl = "http://" + container.getHost() + ":" + container.getMappedPort(3000);

        final Map<String, String> configOverrides = Map.of("quarkus.rest-client.presidio-anonymizer.url", newUrl);

        return new DevServicesResultBuildItem.RunningDevService(FEATURE + "-anonymizer", container.getContainerId(),
                container::close, configOverrides)
                .toBuildItem();
    }

    @BuildStep
    HealthBuildItem addAnalyzerHealthCheck(PresidioBuildTimeConfig buildTimeConfig) {
        return new HealthBuildItem(PresidioAnalyzerHealthCheck.class.getName(),
                buildTimeConfig.healthEnabled());
    }

    @BuildStep
    HealthBuildItem addAnonymizerHealthCheck(PresidioBuildTimeConfig buildTimeConfig) {
        return new HealthBuildItem(PresidioAnonymizerHealthCheck.class.getName(),
                buildTimeConfig.healthEnabled());
    }
}

package io.quarkiverse.presidio.deployment;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "quarkus.presidio.devservice")
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface PresidioDevServiceConfig {

    String ANONYMIZER_IMAGE = "quay.io/lordofthejars/presidio-anonymizer:latest";
    String ANALYZER_IMAGE = "quay.io/lordofthejars/presidio-analyzer:latest";

    @WithName("analyzer.enabled")
    @WithDefault("true")
    boolean enabledAnalyzer();

    @WithName("anonymizer.enabled")
    @WithDefault("true")
    boolean enabledAnonymizer();

    @WithName("anonymizer.image")
    @WithDefault(ANONYMIZER_IMAGE)
    String anonymizerImageName();

    @WithName("analyzer.image")
    @WithDefault(ANALYZER_IMAGE)
    String analyzerImageName();

}

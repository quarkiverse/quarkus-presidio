package io.quarkiverse.presidio.deployment;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "quarkus.presidio.devservices")
@ConfigRoot(phase = ConfigPhase.BUILD_TIME)
public interface PresidioDevServiceConfig {

    String ANONYMIZER_IMAGE = "quay.io/lordofthejars/presidio-anonymizer:latest";
    String ANALYZER_IMAGE = "quay.io/lordofthejars/presidio-analyzer:latest";

    /**
     * Whether an analyzer devservice should start
     */
    @WithName("analyzer.enabled")
    @WithDefault("true")
    boolean enabledAnalyzer();

    /**
     * Whether an anonymizer devservice should start
     */
    @WithName("anonymizer.enabled")
    @WithDefault("true")
    boolean enabledAnonymizer();

    /**
     * Set specific anonymizer devservice container image
     */
    @WithName("anonymizer.image")
    @WithDefault(ANONYMIZER_IMAGE)
    String anonymizerImageName();

    /**
     * Set specific analyzer devservice container image
     */
    @WithName("analyzer.image")
    @WithDefault(ANALYZER_IMAGE)
    String analyzerImageName();

    /**
     * Sets reusable anonymizer container
     */
    @WithName("anonymizer.reuse")
    @WithDefault("true")
    boolean anonymizerReuse();

    /**
     * Sets reusable analyzer container
     */
    @WithName("analyzer.reuse")
    @WithDefault("true")
    boolean analyzerReuse();


}

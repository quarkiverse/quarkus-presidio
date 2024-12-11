package io.quarkiverse.presidio.runtime;

import io.smallrye.config.RelocateConfigSourceInterceptor;

public class RestClientConfigRelocateInterceptor extends RelocateConfigSourceInterceptor {

    public RestClientConfigRelocateInterceptor() {
        super(name -> {

            if (name.startsWith("quarkus.rest-client.presidio-analyzer")) {
                return name.replaceAll(
                    "quarkus\\.rest-client\\.presidio-analyzer",
                    "quarkus.presidio.analyzer");
            }

            if (name.startsWith("quarkus.rest-client.presidio-anonymizer")) {
                return name.replaceAll(
                    "quarkus\\.rest-client\\.presidio-anonymizer",
                    "quarkus.presidio.anonymizer");
            }

            return name;
        });
    }
}

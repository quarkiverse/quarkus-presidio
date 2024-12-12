package io.quarkiverse.presidio.runtime.health;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkiverse.presidio.runtime.Anonymizer;

@Readiness
@ApplicationScoped
public class PresidioAnonymizerHealthCheck implements HealthCheck {

    private final Anonymizer anonymizer;

    public PresidioAnonymizerHealthCheck(@RestClient final Anonymizer anonymizer) {
        this.anonymizer = anonymizer;
    }

    @Override
    public HealthCheckResponse call() {
        HealthCheckResponseBuilder builder = HealthCheckResponse
                .named("Presidio Analyzer health check").up();
        try {
            final Response response = anonymizer.healthGet();

            if (response.getStatus() != 200) {
                builder.down()
                        .withData("reason", "%d status %s"
                                .formatted(response.getStatus(), response.getEntity()));
            }

        } catch (Exception e) {
            return builder.down().withData("reason", e.getMessage()).build();
        }

        return builder.build();
    }
}

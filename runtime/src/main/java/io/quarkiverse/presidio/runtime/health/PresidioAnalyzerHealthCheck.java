package io.quarkiverse.presidio.runtime.health;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;
import org.eclipse.microprofile.health.Readiness;

import io.quarkiverse.presidio.runtime.Analyzer;

@Readiness
@ApplicationScoped
public class PresidioAnalyzerHealthCheck implements HealthCheck {

    private final Analyzer analyzer;

    public PresidioAnalyzerHealthCheck(final Analyzer analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public HealthCheckResponse call() {

        HealthCheckResponseBuilder builder = HealthCheckResponse
                .named("Presidio Analyzer health check").up();
        try {
            final Response response = analyzer.healthGet();

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

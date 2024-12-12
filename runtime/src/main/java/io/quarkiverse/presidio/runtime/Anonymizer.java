package io.quarkiverse.presidio.runtime;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.quarkiverse.presidio.runtime.model.AnonymizeRequest;
import io.quarkiverse.presidio.runtime.model.AnonymizeResponse;
import io.quarkiverse.presidio.runtime.model.DeanonymizeRequest;
import io.quarkiverse.presidio.runtime.model.DeanonymizeResponse;

/**
 * Presidio
 * <p>
 * Context aware, pluggable and customizable PII anonymization service for text and images.
 * </p>
 */
@Path("")
@RegisterRestClient(configKey = "presidio-anonymizer")
public interface Anonymizer {

    /**
     * Anonymize Text
     *
     * @param anonymizeRequest
     */
    @POST
    @Path("/anonymize")
    AnonymizeResponse anonymizePost(
            AnonymizeRequest anonymizeRequest);

    /**
     * Get supported anonymizers
     *
     */
    @GET
    @Path("/anonymizers")
    List<String> anonymizersGet();

    /**
     * Deanonymize Text
     *
     * @param deanonymizeRequest
     */
    @POST
    @Path("/deanonymize")
    DeanonymizeResponse deanonymizePost(
            DeanonymizeRequest deanonymizeRequest);

    /**
     * Get supported deanonymizers
     *
     */
    @GET
    @Path("/deanonymizers")
    List<String> deanonymizersGet();

    /**
     * Healthcheck
     *
     */
    @GET
    @Path("/health")
    @Produces({ "text/plain" })
    Response healthGet();

}

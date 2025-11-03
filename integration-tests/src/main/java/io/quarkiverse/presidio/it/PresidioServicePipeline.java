package io.quarkiverse.presidio.it;

import java.util.Map;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.presidio.runtime.PresidioPipeline;
import io.quarkiverse.presidio.runtime.model.Mask;
import io.quarkiverse.presidio.runtime.model.Replace;
import io.quarkiverse.presidio.runtime.model.SupportedEntities;

@ApplicationScoped
public class PresidioServicePipeline {

    private PresidioPipeline presidioPipeline;

    static Replace REPLACE = new Replace("ANONYMIZED");
    static Mask PHONE = new Mask("*", 4, true);

    public PresidioServicePipeline() {
        this.presidioPipeline = PresidioPipeline.builder()
                .withSupportedEntities(
                        SupportedEntities.PERSON,
                        SupportedEntities.PHONE_NUMBER)
                .withSupportedAnonymizers(
                        Map.of(
                                SupportedEntities.DEFAULT, REPLACE,
                                SupportedEntities.PHONE_NUMBER, PHONE))
                .build();
    }

    public String analysisAndAnonymize(String text, String language) {
        return this.presidioPipeline.process(text, language);
    }

}

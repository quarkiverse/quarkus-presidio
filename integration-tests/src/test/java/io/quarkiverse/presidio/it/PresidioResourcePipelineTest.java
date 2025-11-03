package io.quarkiverse.presidio.it;

import static org.assertj.core.api.Assertions.assertThat;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PresidioResourcePipelineTest {

    @Inject
    PresidioServicePipeline presidioPipeline;

    @Test
    void shouldAnonymizeData() {

        String text = "hello world, my name is Jane Doe. My number is: 034453334";
        String data = presidioPipeline.analysisAndAnonymize(text, "en");

        assertThat(data)
                .isEqualTo("hello world, my name is ANONYMIZED. My number is: 03445****");

    }

}

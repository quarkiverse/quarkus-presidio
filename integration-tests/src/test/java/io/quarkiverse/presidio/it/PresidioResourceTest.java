package io.quarkiverse.presidio.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PresidioResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/presidio")
                .then()
                .statusCode(200)
                .body(is("Hello presidio"));
    }
}

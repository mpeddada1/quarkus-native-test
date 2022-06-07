package com.example;

import static io.restassured.RestAssured.given;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

/**
 * Standard JDK Quarkus Pub/Sub test.
 */
@QuarkusTest
public class QuarkusPubsubSampleTest {

  @Test
  public void testApplicationStartup() {
    given()
        .when().get("/")
        .then().statusCode(200);
  }
}
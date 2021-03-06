package com.application.TestCase;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC4_POST_Scenario3 {
	private static String requestBody = "{\n" +
			"  \"external_id\": \"Interview1\",\n" +
            "  \"latitude\": \"33.44\",\n" +
            "  \"altitude\": \"444\",\n" +
             "  \"longitude\": \"-12.44\" \n}";
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://openweathermap.org";
    }

    @Test
    public void postRequest() {
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/stations")
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());

}}

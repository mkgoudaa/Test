package com.application.TestCase;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.restassured.RestAssured;

import io.restassured.response.Response;


public class TC3_POST_Scenario2 {
	
	private static String requestBody = "{\n" +
            "  \"external_id\": \"DEMO_TEST001\",\n" +
            "  \"latitude\": \"33.33\",\n" +
            "  \"altitude\": \"444\",\n" +
             "  \"longitude\": \"-111.43\" \n}";

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
       // Assert.assertEquals("foo", response.jsonPath().getString("title"));
        //Assertions.assertEquals("bar", response.jsonPath().getString("body"));
        //Assertions.assertEquals("1", response.jsonPath().getString("userId"));
       // Assertions.assertEquals("101", response.jsonPath().getString("id"));

}}

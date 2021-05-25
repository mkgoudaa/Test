package com.application.TestCase;


import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class TC2_POST_Scenario1 {
	
	private static String requestBody = "";            

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

        Assert.assertEquals(401, response.statusCode());
        
}

}
package com.application.TestCase;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class TC5_GET_Scenario {
	
	@BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://openweathermap.org";
    }

    @Test
    public void getRequestWithQueryParam() {
        Response response = given()
                .contentType(ContentType.JSON)
                .param("postId", "2")
                .when()
                .get("/stations")
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("Interview1", response.jsonPath().getString("external_id"));
    }
}



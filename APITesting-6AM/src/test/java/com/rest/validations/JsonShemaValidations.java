package com.rest.validations;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import org.testng.annotations.Test;
public class JsonShemaValidations 
{
	@Test
	public void  validateJsonSchema()
	{
		given().baseUri("https://postman-echo.com").log().all()
		
		.when().get("/get").then().log().all().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("EchoGet1.json"));
	}

}

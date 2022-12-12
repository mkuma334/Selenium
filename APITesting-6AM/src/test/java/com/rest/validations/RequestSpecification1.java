package com.rest.validations;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RequestSpecification1
{
	RequestSpecification x;
@Test(priority=0)
public void validate_StatusCode()
{
	x=given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250");
	
	
	//given(x).when().get("/workspaces").then().log().all().statusCode(200);
}
@Test(priority=1)

	public void m3()
	{
		Response y=x.get("/workspaces").then().log().all().statusCode(200).extract().response();
		assertThat(y.statusCode(),equalTo(200));
	}

@Test(enabled=false)
public void m2()
{
	given(x).when().get("/workspaces").then().log().all().statusCode(200);
	System.out.println("workspaces fetch succesfully");
	
}

}

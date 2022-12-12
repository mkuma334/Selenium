package com.rest.validations;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.hamcrest.text.MatchesPattern;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomatePostUsingHashMap 
{

	@BeforeClass
	public void beforeClass()
	{
		RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
		
		requestSpecBuilder.setBaseUri("https://api.getpostman.com");
		
		requestSpecBuilder.addHeader("x-api-key", "PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250");
		
		requestSpecBuilder.setContentType(ContentType.JSON);
		
		requestSpecBuilder.log(LogDetail.ALL);
		
		RestAssured.requestSpecification=requestSpecBuilder.build();
		
		
		ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder().expectStatusCode(200)
				.expectContentType(ContentType.JSON).log(LogDetail.ALL);
		
		RestAssured.responseSpecification=responseSpecBuilder.build();
	}
	
	
	@Test
	public void m1()
	{
		HashMap<String , Object> mainObject=new HashMap<String, Object>();
		
		HashMap<String, String> nestedObject=new HashMap<String, String>();
		
		nestedObject.put("name", "MapWorkspace");
		
		nestedObject.put("type", "team");
		
		nestedObject.put("visibility", "team");
		
		mainObject.put("workspace", nestedObject);
		
		given().body(mainObject).when().post("/workspaces").then().log().all()
		
		  .assertThat().body("workspace.name", equalTo("MapWorkspace"),
		  "workspace.id", matchesPattern("^[a-z0-9-]{36}$"));
		 
		
		
		
	}
}

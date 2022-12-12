package com.rest.validations;

import org.testng.annotations.Test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import  io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Testing 
{
	@Test
	public void beforeClass()
	{
		RequestSpecBuilder requestspecbuilder =new RequestSpecBuilder()
				.setBaseUri("https://api.getpostman.com").addHeader("x-api-key", "PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
				.setContentType(ContentType.JSON).log(LogDetail.ALL);
		
		
		RestAssured.requestSpecification=requestspecbuilder.build();
		
		ResponseSpecBuilder responsespecbuilder=new ResponseSpecBuilder()
				
				.expectStatusCode(200).expectContentType(ContentType.JSON).log(LogDetail.ALL);
		
		
		RestAssured.responseSpecification=responsespecbuilder.build();
		
	}
	
	@Test
	public void validate_post_map()
	{
		HashMap<String,Object> mainObject1 =new  HashMap<String,Object>();

		HashMap<String,String> nestedObject =new  HashMap<String,String>();

		nestedObject.put("name", "Workspace@Manoj");
		nestedObject.put("description", "workspace testing1 description");
		nestedObject.put("type", "personal");

        mainObject1.put("workspace", nestedObject);
        
		RestAssured.given().body(mainObject1).when().post("/workspaces").then().log().all();
	}
	

}

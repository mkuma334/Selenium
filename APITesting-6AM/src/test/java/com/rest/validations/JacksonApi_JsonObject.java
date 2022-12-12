package com.rest.validations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import  io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JacksonApi_JsonObject 
{
	@Test
	public void beforeClass()
	{
		RequestSpecBuilder requestspecbuilder=new RequestSpecBuilder()
				.setBaseUri("https://api.getpostman.com")
				.addHeader("x-api-key", "PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
				.setContentType(ContentType.JSON).log(LogDetail.ALL);
		
		RestAssured.requestSpecification=requestspecbuilder.build();
		
		ResponseSpecBuilder responsespecbuilder=new ResponseSpecBuilder()
				.expectStatusCode(200).expectContentType(ContentType.JSON).log(LogDetail.ALL);
		
		RestAssured.responseSpecification=responsespecbuilder.build();
		
	}

	
	@Test
	public void validatepostmap() throws JsonProcessingException
	
	{
		HashMap<String, Object> mainobject=new HashMap<String, Object>();
		HashMap<String, String> nestedobject=new HashMap<String, String>();
		
		nestedobject.put("name","workspaces@Sowji");
		//nestedobject.put("description", "desc");
		nestedobject.put("type", "personal");
		
		//HashMap<String, Object> mainobject=new HashMap<String, Object>();
		
		mainobject.put("workspace", nestedobject);
		
		
		  ObjectMapper x=new ObjectMapper(); String y=
		  x.writeValueAsString(mainobject);
		 
		
		RestAssured.given().body(y).post("/workspaces").then().log().all();
	}
}

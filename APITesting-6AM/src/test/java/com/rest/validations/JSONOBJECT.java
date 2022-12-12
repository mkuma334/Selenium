package com.rest.validations;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.HashMap;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import  io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class JSONOBJECT 
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
	public void serialize_json_using_jackson() throws JsonProcessingException
	{
		ObjectMapper objectmapper =new ObjectMapper();
		
		ObjectNode nestedobjectnode= objectmapper.createObjectNode();
		
		nestedobjectnode.put("name", "workspace@Sailu");
		
		nestedobjectnode.put("type", "personal");
		
		ObjectNode mainobjectnode =objectmapper.createObjectNode();
		
		mainobjectnode.set("workspace", nestedobjectnode);
		
		
		String mainobject=objectmapper.writeValueAsString(mainobjectnode);
		
		RestAssured.given().body(mainobject).post("/workspaces");
		
		
	}
}

package com.rest.validations;

import org.testng.annotations.Test;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.RequestSpecification.*;
import io.restassured.specification.ResponseSpecification;
import  io.restassured.builder.ResponseSpecBuilder.*;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

public class AutomateJsonArray2 
{
	//RequestSpecification requestspecification;
	
	//ResponseSpecification responsespecification;
	
	@Test
	public void m1()
	
	{
		RequestSpecification requestspecification;
		
		ResponseSpecification responsespecification;
		RequestSpecBuilder rs=new RequestSpecBuilder().setBaseUri("https://9f9427a3-047b-4fca-93b2-b98843c7bdad.mock.pstmn.io").addHeader("x-mock-match-request-body", "true")
				              .setContentType(ContentType.JSON).log(LogDetail.ALL);
		
		requestspecification =rs.build();
		
		ResponseSpecBuilder rsb=new ResponseSpecBuilder()
				.expectStatusCode(200).expectContentType(ContentType.JSON).log(LogDetail.ALL);
		
		responsespecification=rsb.build();
				
			
			
	}
	
	@Test
	public void validate_post_request_payload_json_array_as_list()
		{
		HashMap<String, String> hm=new HashMap<String,String>();
		
		hm.put("name", "manoj");
		
		hm.put("age", "26");
		
		RestAssured.given().when().post("/x").then().assertThat().body("msg",Matchers.equalTo("Post request 2 is printed succesfully"));
	}
	

}

package com.rest.validations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class AutomateJsonArray 
{
	//RequestSpecification x1;
	@BeforeClass
	public void beforeClass()
	{
		RequestSpecification x1;
		
		ResponseSpecification y1;
		RequestSpecBuilder x=new RequestSpecBuilder().setBaseUri("https://5a4731ea-098b-4c2d-a850-183096063d34.mock.pstmn.io")
				.addHeader("x-mock-match-request-body", "true")
				.setContentType(ContentType.JSON).log(LogDetail.ALL);
		
		x1=x.build();
		
		ResponseSpecBuilder y=new ResponseSpecBuilder()
		
		
		.expectStatusCode(200).expectContentType(ContentType.JSON).log(LogDetail.ALL);
		
		y1=y.build();
		
					
	}
	
	@Test
	public void validate_post_request_payload_json_array_as_list()
	{
		HashMap<String, String> obj=new HashMap<String, String>();
		
		obj.put("id", "001");
		
		obj.put("id", "002");
		
		HashMap<String, String> obj1=new HashMap<String, String>();
		
		obj1.put("id", "003");
		
		obj1.put("id", "004");
		
		List<HashMap<String, String>> list1=new ArrayList<HashMap<String,String>>();
		
		list1.add(obj);
		list1.add(obj1);
		
		RestAssured.given().
        body(list1).
        when().post("/post").
        then().
        assertThat().
        body("msg", Matchers.equalTo("succesfully created data"));
		
 		
	}

}

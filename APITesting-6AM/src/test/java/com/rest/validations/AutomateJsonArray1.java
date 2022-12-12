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

import org.hamcrest.Matchers;
import org.hamcrest.text.MatchesPattern;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomateJsonArray1 
{
	//RequestSpecification x1;
		@BeforeClass
		public void beforeClass()
		{
			//RequestSpecification x1;
			RequestSpecBuilder x=new RequestSpecBuilder().setBaseUri("https://9f9427a3-047b-4fca-93b2-b98843c7bdad.mock.pstmn.io")
					.addHeader("x-mock-match-request-body", "true")
					.setContentType(ContentType.JSON).log(LogDetail.ALL);
			
			x.build();
			
			ResponseSpecBuilder o=new ResponseSpecBuilder()
			
			
			.expectStatusCode(200).expectContentType(ContentType.JSON).log(LogDetail.ALL);
			
			RestAssured.responseSpecification=o.build();
			
						
		}
		
		@Test
		public void validate_post_request_payload_json_array_as_list()
		{
			HashMap<String, String> obj=new HashMap<String, String>();
			
			obj.put("id", "5001");
			
			obj.put("type", "none");
			
			HashMap<String, String> obj1=new HashMap<String, String>();
			
			obj1.put("id", "5002");
			
			obj1.put("type", "Glazzed");
			
			List<HashMap<String, String>> list1=new ArrayList<HashMap<String,String>>();
			
			list1.add(obj);
			list1.add(obj1);
			
			RestAssured.given().
	        body(list1).
	        when().post("/post3").
	        then().
	        assertThat().
	        body("msg", Matchers.equalTo("psot request 3 is succesfully executed"));
			
	 		
		}

}

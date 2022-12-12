package com.test.java;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.Assert.*;
import org.testng.annotations.Test.*;

import io.restassured.path.json.JsonPath.*;
import io.restassured.response.Response;

public class hamcrest_assert_on_extracted_response {
  @Test
  public void f() {
	  
	 String name= given().baseUri("https://api.getpostman.com").header("x-api-key", "PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250").
	  when().get("/workspaces").
	  then().assertThat().statusCode(200).extract().response().path("workspaces[0].name");
	 
	 assertThat(name,equalTo("My Workspace"));
	 
	 
	 
  }
  
  @Test
  public void hamcrest_assert_on_extracted_response1()
  {
	  Response res1=given().baseUri("https://api.getpostman.com").header("x-api-key", "PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250").
	  when().get("/workspaces").
	  then().assertThat().statusCode(200).extract().response();
	  
	  System.out.println("extracted responce is " + res1.path("workspaces[0].name"));
  }
  @Test
  public void Hamcrest_assert_on_extracted_response2()
  {
	  given().baseUri("https://api.getpostman.com").header("x-api-key", "PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250").
	  when().get("/workspaces").
	  then().assertThat().statusCode(200).
	       body("workspaces.name", hasItems("My Workspace", "Team Workspace", "API Testing"),
	    		   "workspaces.type", hasItems("personal", "team", "team", "personal"),
	    		   "workspaces.size",equalTo(13));
	  
  }
}

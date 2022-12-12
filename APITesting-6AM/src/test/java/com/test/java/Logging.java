package com.test.java;

import javax.annotation.meta.When;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;

import static io.restassured.RestAssured.config;

import java.util.HashSet;
import java.util.Set;
public class Logging {
  @Test()
  public void f() 
  {
	  RestAssured.given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250").

	  config(config.logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails())).
	  when().get("/workspaces").
	  then().statusCode(201);
	  
  }
  
  @Test
  public void m1()
  {
	  RestAssured.given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250").

	  config(config.logConfig(LogConfig.logConfig().blacklistHeader("x-api-key"))).log().all().
	  when().get("/workspaces").
	  then().statusCode(200);
	  
  }
  
  @Test
  public void m2()
  {
	  Set<String> headers=new HashSet<String>();
	  
	  headers.add("x-api-key");
	  headers.add("Accept");
	  RestAssured.given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250").

	  config(config.logConfig(LogConfig.logConfig().blacklistHeaders(headers))).log().all().
	  when().get("/workspaces").
	  then().statusCode(200);
  }
}

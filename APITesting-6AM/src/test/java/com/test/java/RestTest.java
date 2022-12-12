package com.test.java;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.RestAssured.*;

import io.restassured.matcher.RestAssuredMatchers.*;

import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;
public class RestTest 
{
	@Test
	public void test()
	{
		RestAssured.given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250" )
		.when().get("/workspaces").then().statusCode(200).body("workspaces[0].name", org.hamcrest.Matchers.is(org.hamcrest.Matchers.equalTo("My Workspace")),
				                                               "workspaces[0].type", org.hamcrest.Matchers.is(org.hamcrest.Matchers.equalTo("personal")));
		
	}

}

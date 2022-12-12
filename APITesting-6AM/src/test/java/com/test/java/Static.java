package com.test.java;
import  org.testng.annotations.Test;




import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;


import static  org.hamcrest.Matchers.*;
public class Static {

	@Test
	public void m1()
	{
		given().baseUri("https://api.getpostman.com").headers("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
		.when().get("/workspaces")
		.then().statusCode(200).body("workspaces[0].name", is(equalTo("My Workspace")));
		                             
	}
	
	
}

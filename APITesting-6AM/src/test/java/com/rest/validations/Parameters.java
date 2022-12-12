package com.rest.validations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
public class Parameters {

	@Test
	public void Single_Query_Parameter()
	{
	given().baseUri("https://postman-echo.com").param("foo1", "bar").log().all().when()
	.get("/get").then().log().all().assertThat().statusCode(200);
	
	/*.get("/get").then().log().all().assertThat().statusCode(200);*/
	  
	}
	
	@Test
	public void Handling_Muiltiple_Parameter()
	{
		HashMap<String, String> Queryparams= new  HashMap<String,String>();
		
		Queryparams.put("foo2", "bar3");
		
		Queryparams.put("foo3", "bar4");
		
		
		given().baseUri("https://postman-echo.com").queryParams( Queryparams)
		.log().all().when().get("/get").then().log().all().assertThat().statusCode(200);
		
		
	}
	
	@Test
	public void SingleKey_MuiltipleVlaues()
	{
		given().baseUri("https://postman-echo.com").queryParam("foo4", "bar5","bar6","bar7")
		
		.log().all().when().get("/get").then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void path_Parameter()
	{
		given().baseUri("https://reqres.in/").pathParam("userid", 2).when().get("api/users/{userid}/{userId1}").then().log()
		.all().assertThat().statusCode(200);
	}
}

package com.test.java;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.TestSpecificationImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class AutomateGet 
 {
	private void def() {
		// TODO Auto-generated method stub

	}
  @Test(enabled=false)
  public void f()
  {
	  given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
	  .when().
	        get("/workspaces")
	  .then()
	       .log().all()
	        .assertThat()
	             .statusCode(200);
	  TestSpecificationImpl x;
  }
	  
	  @Test(enabled=false)
	  public void validateResponseBody()
	  {
		  given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
		  .when().
		        get("/workspaces")
		  .then()
		       .log().all()
		        .assertThat()
		             .statusCode(200).
		             body("workspaces.name",hasItems("My Workspace", "Team Workspace", "API Testing","Test Workspace","Manoj Workspace","workspace1",
		            		 "workspace1","workspace1","workspace_7","personal workspace","workspaccefinal","API","Restassured Workspce"),
		            		              "workspaces.type", hasItems("personal", "team","team","personal","personal","personal","personal","personal"
		            		            		  ,"personal","personal","personal","personal","personal"),
		            		              "workspaces[1].name", equalTo("Team Workspace")
		            		              );
		  
	  }
	  
	 
	  @Test
	  public void m1()
	  {
		  given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
		  .when().
		        get("/workspaces")
		  .then()
		       
		        .assertThat()
		             .statusCode(200).
		             body("workspaces.name",hasItems("My Workspace", "Team Workspace", "API Testing", "Test Workspace", "Manoj Workspace", "workspace1", "workspace1", "workspace1", 
		            		 "workspace_7", "personal workspace", "workspaccefinal","API", "Restassured Workspce"),
		            		 
		            		 "workspaces.type",hasItems("personal", "team", "team", "personal", "personal", "personal", "personal", 
		            				 "personal", "personal", "personal", "personal", "personal", "personal"),
		            		              
		            		     "workspaces[0].name",equalTo("My Workspace"));
		  
	  }
	  
	
	  
	  @Test
	  public void m3()
	  {
		  Response res= given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
				  .when().get("/workspaces").
				  then().statusCode(200).extract().response();
				        
				RequestSpecification x= (RequestSpecification) new RequestSpecBuilder();
				//System.out.println("response is.... " + res.path("workspaces[2].name"));
				
				  JsonPath js=new JsonPath(res.asString()); 
              System.out.println("jsonpath response" + js.getString(
				  "workspaces[2].name"));
				 
	  }
	  
}

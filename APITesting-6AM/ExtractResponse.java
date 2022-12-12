import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ExtractResponse {
  
	@Test
	public void m1()
	{
		Response res= given().baseUri("https://api.getpostman.com").header("x-api-key","PMAK-630eb68b3d35824786fb3822-4cd6b48c978859cf33ab6492cd9ccf5250")
				  .when().get("/workspaces").
				  then().log().all().assertThat().statusCode(200).extract().response();
				        
				
				//System.out.println("response is " + res.asString());
		JsonPath js=new JsonPath(res.asString);
		System.out.println(js.getString());
		
	}
}


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rest.validations.RequestSpecBuilder.*;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Filters {
	
	RequestSpecification requestspecification;
	
	ResponseSpecification responsespecification;
	@BeforeClass
	
	public void BeforeClass()
	{
		RequestSpecBuilder requestspecbuilder=new RequestSpecBuilder()
				.setBaseUri("https://postman-echo.com")
				.addFilter(new RequestLoggingFilter(LogDetail.ALL))
				 .addFilter(new RequestLoggingFilter(LogDetail.URI));
				
				requestspecification=requestspecbuilder.build();
				
		ResponseSpecBuilder responsespecification1=new ResponseSpecBuilder()
		
                  .expectStatusCode(200);
		
	    responsespecification= responsespecification1.build();
		
		
		
	}
	
	@Test(enabled=false)
	public void loggingFilter()
	{
		given().spec(requestspecification).when().get("/get").then().assertThat().statusCode(200);
	}

	@Test
	public void LoggingFilter1() throws FileNotFoundException
	{
		PrintStream ps=new PrintStream(new File ("restAssured.log"));
		
				given().baseUri("https://postman-echo.com").filter(new RequestLoggingFilter(ps))
				.filter(new ResponseLoggingFilter(ps))
				.when().get("/get").then().assertThat().statusCode(200);
				
	}
}

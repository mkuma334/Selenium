package com.rest.validations;

import org.mozilla.javascript.ast.NewExpression;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.File;
public class UploadFile 
{
	@Test
	public void UploadFile_MaltiPart_Method()
	{
		
		given().baseUri("https://postman-echo.com").multiPart("file", new File("add.txt"))
		
		.log().all().when().post("/post").then().log().all().assertThat().statusCode(200);
		
	}

}

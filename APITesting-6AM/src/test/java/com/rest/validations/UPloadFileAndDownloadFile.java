package com.rest.validations;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.testng.annotations.Test;
public class UPloadFileAndDownloadFile {

	@Test
	public void download_file() throws IOException
	{
		byte[] x=given().baseUri("https://github.com").log().all().when().
		get("/appium-boneyard/sample-code/raw/master/sample-code/apps/ApiDemos/bin/ApiDemos-debug.apk")
		.then().log().all().extract().response().asByteArray();
		
		OutputStream os =new FileOutputStream(new File ("ApiDemos-debug.apk"));
		
		os.write(x);
		
		os.close();
		
		
	}
}

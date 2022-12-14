package pac2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Testng_WebDriver_Test 
{
// static	String driverspath="C:\\Users\\HP\\Eclipse 30-06-2022\\pac 30-06-22\\Chromedrivers\\chromedriver.exe";
	String url="https://en-gb.facebook.com/r.php";
	WebDriver driver;
	
 
  @Test
  public void f() 
  {
	  driver.findElement(By.xpath("(//button[contains(.,'Sign Up')])[1]"));
	  
	  Assert.assertEquals(driver.getCurrentUrl(),"https://en-gb.facebook.com/r.php");
	  
	  Reporter.log("Facebook signup title page is match", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  FileHandler.createDir(new File("\\screens"));
	  
	  FileHandler.copy(src, new File(  method.getName( )+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Eclipse 30-06-2022\\pac 30-06-22\\Chromedrivers\\chromedriver.exe");
	 driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.quit();
  }

}

package pac2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testng_Method_Dependencies {
  @Test()
  public void lauch_Browser() 
  {
	  Assert.assertTrue(true);
	  
	  Reporter.log("browser launch succesfully");
  }
  
  @Test(dependsOnMethods ={"lauch_Browser"})
  public  void app_load()
 {
	  Assert.assertTrue(false);
	  Reporter.log("app load is succesfully");
  }
  
  @Test(dependsOnMethods = {"app_load"})
  public void enter_details()
  {
	  org.testng.Assert.assertTrue(true);
	  Reporter.log("enter details given sucessfully");
  }
  
  @Test(dependsOnMethods = {"enter_details"})
  public void login()
  {
	  org.testng.Assert.assertTrue(true);
	  Reporter.log("login validated sucessfully");
  }
  
  
  
  
}

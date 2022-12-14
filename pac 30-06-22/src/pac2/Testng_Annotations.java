package pac2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testng_Annotations {
  @Test
  public void tc001() 
  {
	  Assert.assertEquals("manoj","manoj");
	  Reporter.log("tc001 method is executes succesfully",true);
  }
  @Test
  public void tc002()
  {
	  Assert.assertEquals("kumar","kuma");
      Reporter.log("tc002 is executed succesfully",true);	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("thz Beforemethod invoke to run Before Execution of each and every text");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("this Aftermethod invoke to run After exectuion of each and every text");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("this BeforeClass invoke to run Before execution of first@Test annatated method");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("this Afterclass method invoke to run After exection of last @Test annotated method");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("this method invoke to run before exection of class ");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("this method invoke to run after execution of class");
  }

}

package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class classTest2 {
  @Test
  public void f() 
  {
	  
	  System.out.println("@Test1");
  }
  @Test
  public void m()
  {
	  System.out.println("@Test2");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("@Beforemethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("@After method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("@Beforeclass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("@Afterclass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("@Aftertest");
  }

}

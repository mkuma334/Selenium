package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class classTest {
  @Test
  public void f()
  {
	  System.out.println("hi");
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("i am fine");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("how r u");
  }
  

}

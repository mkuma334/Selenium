package pac2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class class1 {
  @Test(groups={"reg1","reg2"})
  public void tc01()
  {
	  Assert.assertEquals("hi", "hi");
	  Reporter.log("tc01  reg1 is excecuted succesfully",true);
  }
  @Test(groups="reg2")
  public void tc02()
  {
	  Assert.assertEquals("hi","h");
	  Reporter.log("tco2 is reg2 executes succesfully",true);
  }
  
  @Test(groups="reg1")
  public void tc03()
  {
	  org.testng.Assert.assertTrue(true);
	  Reporter.log("tc03 reg1 is executed succesfully",true);
  }
}

package pac2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 {
  @Test(groups="reg2")
  public void tc04() 
  {
	  Assert.assertTrue(true);
	  Reporter.log("tc04 is executed succesfully");
  }
  @Test(groups="reg1")
  public void tc05()
  {
	  Reporter.log("tc05 is executed succesfully");
  }
  @Test(groups="reg12")
  public void tc06()
  {
	  Assert.assertTrue(false);
	  Reporter.log("tc05 is executed succesfully");
  }
}

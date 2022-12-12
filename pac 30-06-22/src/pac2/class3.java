package pac2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class3 {
  @Test(groups="reg1",dependsOnGroups = "reg1")
  public void tc07() 
  {
	  Assert.assertTrue(true);
	 Reporter.log("tc07 is executed succesfully"); 
  }
  @Test(groups="reg2",dependsOnGroups = "reg1")
  public void tc08()
  {
	  Reporter.log("tc08 is executed succesfully");
  }
  {
	  
  }
}

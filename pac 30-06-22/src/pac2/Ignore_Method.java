package pac2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Ignore_Method {
  @Test(priority=0)
  public void tc001() 
  {
	  Assert.assertEquals("m","m");
	  Reporter.log("tcoo1 is executed succesfully");
  }
  
  @Test(priority=1,enabled=false) // if enabled=false it doesnt show failure report its just skipped
  public void tc002()
  {
	  Assert.assertEquals("m", "m");
	  Reporter.log("tc002 is not executed it going to skip and report in index.html in emailable report");
  }
  @Test
  public void tc003()
  {
	  Assert.assertEquals("m","m");
	  Reporter.log("tc003 is executed succesfully");
  }
  
  
}

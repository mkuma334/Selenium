package pac2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
  

@Test(dataProvider="m1")
  public void f(String name,String age) 
  {
	System.out.println(name  +"    "+ age);
	
	  
  }
  
  @DataProvider 
  public String[][] m1()
  {
	  String x[][]= {
			  
			  
			  {"manoj","jkumar"},
			  {"namna","kkkk"}
			 
	  };
	  
	  return x;
  }
  
 @DataProvider
 public Object[][] f()
 {
	 return new Object[][]
			 {
		    new Object[] {"manoj",25}
			 };
			  
  }
  
  
}

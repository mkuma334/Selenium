package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class CalenderTest
{
	WebDriver driver;
	String month1text;
	String month2text;
	
	String Actual_Month;
	
	String Actual_Day;
	
	String Expected_Month;
	
	String Expected_day;
  @Test
  public void f() throws Exception 
  {
	  WebElement calender=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/div[@class='css-1dbjc4n'])[3]"));
	  
	  calender.click();
	  
	  Thread.sleep(2000);
	  
		/*
		 * WebElement month1=driver.findElement(By.
		 * xpath("//div[contains(.,'July 2022') and contains(@dir,'auto')]"));
		 * 
		 * WebElement month2=driver.findElement(By.
		 * xpath("//div[contains(.,'August 2022') and contains(@dir,'auto')]"));
		 * 
		 * 
		 * month1text=month1.getText(); System.out.println("month1 text is " +
		 * month1text);
		 * 
		 * month2text=month2.getText();
		 * 
		 * System.out.println("month2 text is " + month2text);
		 */
	  
	  
		/*
		 * for(int i=0;i<=6;i++) { Expected_Month="July "; Expected_day="6";
		 */
          
        List<WebElement> all_Months_title=driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
        
        for(int i=0;i<=all_Months_title.size();i++)
        {
        	WebElement runtime_monthtitle =all_Months_title.get(i);
        	
        	Expected_Month="January 2023";
        	
        	String runtime_month_text=runtime_monthtitle.getText();
        	
        	if(runtime_month_text.equals(Expected_Month)) 
        	{
 //WebElement date=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[24]/div/div[3]/div/div[6]"));
        		
      WebElement date=driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz'])[23]/div/div[3]/div[6]/div[2]"));
        		
 date.click();
 
// (//div[@class='css-1dbjc4n r-18u37iz'])[23]/div/div[3]/div[6]/div[2]
        	
        		
        		System.out.println("expected month is 143" +Expected_Month);
        	  break;
            }
        
    	  
    	  
    	  
		/*
		 * month1text=month1.getText(); System.out.println("month1 text is " +
		 * month1text);
		 * 
		 * month2text=month2.getText();
		 * 
		 * System.out.println("month2 text is " + month2text);
		 * 
		 * if(month1text.contains(Expected_Month))
		 * 
		 * { driver.findElement(By.linkText(Expected_day));
		 * System.out.println("------month1test matched " + month1text); break; }
		 * 
		 * if(month2text.equals(Expected_Month)) {
		 * System.out.println("--------------month1test matched " + month2text); break;
		 * }
		 */
		  
		  WebElement nextbutton=driver.findElement(By.cssSelector("circle[cx='24.5'][stroke='#DDD']"));
		  
		  nextbutton.click();
		  
		  Thread.sleep(2000);
		  
	  }
  }
  @BeforeClass
  public void beforeClass() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver","Chromedrivers\\\\chromedriver.exe");
	  
	   driver=new ChromeDriver();
	  
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

  

}

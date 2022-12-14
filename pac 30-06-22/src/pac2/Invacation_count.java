package pac2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Invacation_count {
	String url = "https://en-gb.facebook.com/r.php";

	WebDriver driver = null;

	String drivers = "Chromedrivers\\chromedriver.exe";

	int count = 0;

	@Test(description = "This method is for testing dropdown for month", invocationCount = 11)
	public void sample() {

		Select month = new Select(driver.findElement(By.xpath("//select[@title='Month']")));
		month.selectByIndex(count);
		count++;

	}

	@AfterMethod
	public void AfterMethod(Method method) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("\\screens"));
		try {
			FileHandler.copy(src, new File(method.getName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", drivers);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}

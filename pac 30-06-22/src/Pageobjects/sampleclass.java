package Pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		try {
			/*
			 * Thread.sleep(5000); for(int i=0;i<=5;i++) { System.out.println("hello");
			 * 
			 * Thread.sleep(5000); }
			 */
			System.setProperty("webdriver.chrome.driver","Chromedrivers\\chromedriver.exe");
			
			 driver =new ChromeDriver();
			driver.get("https://classroom.google.com/u/0/w/NDc3NzkzNDc5Mzc5/t/all");
			
			driver.manage().window().maximize();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally {
			driver.quit();
			
		}
		
		
		
		}
		
		
		
		  
		
	
	
	}





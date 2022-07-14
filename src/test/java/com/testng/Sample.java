package com.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static WebDriver driver;
	@Parameters("browser")
	@Test
	private void test01(String bwr) {
		if (bwr.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}if (bwr.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("yamaha",Keys.ENTER);
		
			
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



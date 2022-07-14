package com.testng;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {
	public static WebDriver driver;
	
	@Test
	private void test01() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Point p=new Point(150, 150);
		driver.manage().window().setPosition(p);
					
	}
	

	@Test
	private void tc02() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		Point p=new Point(200, 200);
		driver.manage().window().setPosition(p);
	}
	@Test
	private void tc03() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Point p=new Point(250, 250);
		driver.manage().window().setPosition(p);

	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



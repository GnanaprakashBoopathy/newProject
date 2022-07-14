package com.practicetestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	public static WebDriver driver;
	
	
	
	@Parameters("browsers")
	@Test
	private void test01(String browsers) {
		if(browsers.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.navigate().to("https://www.google.com/");
		}else if (browsers.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.navigate().to("https://www.google.com/");	
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
}

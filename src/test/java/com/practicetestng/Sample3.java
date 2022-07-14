package com.practicetestng;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {
	public static WebDriver driver;
	
	@Test
	public void test01() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Dimension dim=new Dimension(500,500);
		driver.manage().window().setSize(dim);
		Point p=new Point(50,50);
		driver.manage().window().setPosition(p);
		
		
	}

	@Test
	public void test02() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Dimension dim=new Dimension(500,500);
		driver.manage().window().setSize(dim);
		Point p=new Point(500,50);
		driver.manage().window().setPosition(p);
	}

	@Test
	public void test03() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Dimension dim=new Dimension(500,500);
		driver.manage().window().setSize(dim);
		Point p=new Point(50,500);
		driver.manage().window().setPosition(p);
	}







}

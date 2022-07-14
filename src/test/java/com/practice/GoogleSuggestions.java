package com.practice;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSuggestions extends PomBaseClass{
	@BeforeClass
	public static void launchingBrowser() {
		PomBaseClass p=new PomBaseClass();
		p.launchBrowser();

	}
	public static PomBaseClass b;
	@BeforeClass
	public static void tillUrl() {
		b=new PomBaseClass();
		b.launchBrowser();
		b.url("https://www.google.com/");
		
	}
	@Before
	public void bef() {
		Date date=new Date();
		System.out.println("The start time is "+date);	
	}
	@After
	public void aft() {
		Date date1=new Date();
		System.out.println("The end time is "+date1);
	}
	
	@AfterClass
	public static void aftClass() {
		//b.cquit();
	}
	
	@Test
	public void test01() {
		WebElement ff = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		ff.sendKeys("boopathy");
//		b.searchElement("//input[@name=\"q\"]").sendKeys("Boopathy");
//		b.ent();
//		List<WebElement> manyElements = b.manyElements("//span[contains(text(),\"Boopathy\")]");
//		
//		for (int i = 0; i < manyElements.size(); i++) {
//			WebElement webElement = manyElements.get(i);
//			String text = webElement.getText();
//			System.out.println(text);
//		}
//	
	
	
	
	
	
	}}
	
	
	
	



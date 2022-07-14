package com.newproject.MavenProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ProgramImplementation extends BaseClass  {
	public static BaseClass b;
	@BeforeClass
	public static void launchingBrowser() {
	    b=new BaseClass();
		b.launchBrowser();
		
	}
	
	@Before
	public void startTiming() {
		Date date=new Date();
		System.out.println("start timing is:"+date);

	}
	@After
	public void endtiming() {
		Date date=new Date();
		System.out.println("end timing is:"+date);		

	}
	@AfterClass
	public static void browserClose() {
	b.closeTab();

	}
	@Test
	public void tc01() throws InterruptedException {
		b.launchUrl("https://www.google.com/");
		b.implicitlyWait(10);
		WebElement txtSearch = b.findLocatorName("q");
		b.enterText(txtSearch, "yamaha");		
		List<WebElement> allSuggestions = b.findElements("//span[contains(text(),'yamaha')]");
		for (WebElement sugg : allSuggestions) {
			String text = sugg.getText();
			b.print(text);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

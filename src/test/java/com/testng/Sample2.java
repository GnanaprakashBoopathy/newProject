package com.testng;



import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample2 {
	public static WebDriver driver;
	
	@Test(groups="@smoke")
	private void test01() {
		Assert.assertTrue(false);
		System.out.println("test01");
					
	}
	

	@Test(dependsOnGroups="@smoke")
	private void tc02() {
		
		System.out.println("test 02");
	}
	@Test
	private void tc03() {
		System.out.println("test 03");
	}
	@Test
	private void tc04() {
		System.out.println("test 04");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



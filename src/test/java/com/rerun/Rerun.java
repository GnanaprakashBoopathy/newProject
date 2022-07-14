package com.rerun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rerun {
	public static WebDriver driver;
	@Test
	private void test01() {
		System.out.println("test 01");

	}
	@Test(retryAnalyzer=RetryTestCase.class)
	private void test02() {
		Assert.assertTrue(false);
		System.out.println("test 02");


	}
	
	@Test
	private void test03() {
		System.out.println("test03");
	}
	
	@Test
	private void test04() {
		System.out.println("test04");
	}
	
	
	
	

}

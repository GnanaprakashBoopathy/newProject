package com.practicetestng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Sample {
	public static WebDriver driver;
	@Test
	public void test01() {
		System.out.println("Test 01");
	}
	@Test
	public void test02() {
		System.out.println("Test 02");
	}
	@Test
	public void test03() {
		Assert.assertTrue(false);
		System.out.println("Test 03");
	}
	@Test
	public void test04() {
		System.out.println("Test 04");
	}
	@Test
	public void test05() {
		Assert.assertTrue(false);
		System.out.println("Test 05");
	}
	@Test
	public void test06() {
		System.out.println("Test 06");
	}

}

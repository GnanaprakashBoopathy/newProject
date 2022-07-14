package com.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BaseImplementationPractice extends BaseClassPractice {
	public static void main(String[] args) throws InterruptedException {
		BaseClassPractice b = new BaseClassPractice();

		b.browserLaunch();
		b.enterUrl("https://www.google.com/");
		WebElement element1 = b.elementXpath("//input[@name=\"q\"]");
		b.searchTextEnter(element1, "selenium training in chennai");
		WebElement greens = b
				.elementXpath("//h3[text()=\"Selenium Certification Training in Chennai - Greens Technology\"]");
		b.elementClick(greens);
		WebElement element2 = b.elementXpath("//div[@id=\"heading304\"]");
		b.elementClick(element2);
		b.staticWaiting(2000);
		WebElement element3 = b.elementXpath("//a[text()=\" DataDriven\"]");
		b.staticWaiting(2000);

		b.elementClick(element3);

	}
}

package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPractice {

	public static WebDriver driver;
	 Robot robot;


	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void browserMaximize() {
		driver.manage().window().maximize();
	}

	public void enterUrl(String url) {
		driver.navigate().to(url);
	
	}
	public void robotKeys(String keys) throws AWTException {
		
		 robot=new Robot();
		 switch (keys) {
		case "ENTER":
			robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
			break;
		case "DOWN":
			robot.keyPress(KeyEvent.VK_DOWN);
			 robot.keyRelease(KeyEvent.VK_DOWN);
			break;

		default:
			break;
		}
		 
		

	}

	public WebElement elementXpath(String Xpath) {
		return driver.findElement(By.xpath(Xpath));
	}

	public void searchText(WebElement element, String searchText) {
		element.sendKeys(searchText);
	}
	
	
	public void searchTextEnter(WebElement element, String searchText) {
		element.sendKeys(searchText,Keys.ENTER);
		
	}
	
	public void elementClick(WebElement element) {
		element.click();
	}
	
	public void staticWaiting(int time) throws InterruptedException {
		Thread.sleep(time);

	}
	











}

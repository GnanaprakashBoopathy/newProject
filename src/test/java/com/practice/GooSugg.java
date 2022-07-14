package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooSugg{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		WebElement sear = driver.findElement(By.name("q"));
		sear.sendKeys("Mahatma",Keys.ENTER);
		List<WebElement> elem = driver.findElements(By.xpath("//span[contains(text(),\"mahatma\")]"));
		for (WebElement webElement : elem) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		
		
		
		
		
		
	}
}

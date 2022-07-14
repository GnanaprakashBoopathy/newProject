package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("yamaha");
		Thread.sleep(3000);
		List<WebElement> allSuggessions = driver.findElements(By.xpath("//li[@data-view-type=\"1\"]/descendant::span[2]"));
		for (WebElement suggest : allSuggessions) {
			String text = suggest.getText();
			System.out.println(text);
		}
		
		
	}

}

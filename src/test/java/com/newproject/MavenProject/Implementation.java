package com.newproject.MavenProject;





import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Implementation extends BaseClass{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]/parent::div[@class=\"_6lux\"]/parent::div/following-sibling::div[@class=\"_6ltg\"]/child::button")).click();
		
	}
		
		
		
		
		
		
		
		
	

}

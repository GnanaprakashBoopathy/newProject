package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomBaseClass {
	public static WebDriver driver;
	public static Actions actions;
	
public void ent() {
	actions=new Actions(driver);
	actions.sendKeys(Keys.ENTER);
}

public List<WebElement> manyElements(String path) {
	return driver.findElements(By.xpath(path));
}


public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
public void url(String url) {
	driver.navigate().to(url);
}
public WebElement searchElement(String xpath1) {
	return driver.findElement(By.xpath(xpath1));
}
public void giveText(WebElement element, String text1) {
	element.sendKeys(text1);
}
public void singleClick(WebElement element) {
	element.click();
}
public void maximize() {
	driver.manage().window().maximize();
	
}

public void cquit() {
	driver.quit();
}



public String excelInput(int rowNo, int dataNo) throws FileNotFoundException, IOException {
	Workbook workbook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\Excel File\\Book1.xlsx")));
	Sheet sheet = workbook.getSheet("Sheet1");
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(dataNo);
	String string = cell.toString();
	return string;



}

















}

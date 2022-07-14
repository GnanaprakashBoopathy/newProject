package com.newproject.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import net.bytebuddy.implementation.bytecode.Duplication;

public class BaseClass {
	 public static WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public void winMaximize() {
		driver.manage().window().maximize();

	}
	public void launchUrl(String url) {
	driver.navigate().to(url);
	}
	public WebElement findLocator(String xpath) {
		return driver.findElement(By.xpath(xpath));

	}
	public WebElement findLocatorName(String name) {
		return driver.findElement(By.name(name));

	}
	public List<WebElement> findElements(String xpath) {
		return driver.findElements(By.xpath(xpath));

	}
	public void print(String text) {
	System.out.println(text);

	}
	public void implicitlyWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	public void btnClick(WebElement element) {
		element.click();

	}
	public void enterText(WebElement element,String text) {
		element.sendKeys(text);

	}
	
	
	public void closeTab() {
		driver.close();
	}
	
	public String takeText(WebElement element) {
		return element.getText();
		
	}
	public String excelRead(int rowNo, int clmNo) throws FileNotFoundException, IOException {
		Workbook workbook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\Excel File\\Book1.xlsx")));
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(clmNo);
		String string = cell.toString();
		return string;
			
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

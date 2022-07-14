package com.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBassClass {
	public static WebDriver driver;
	public static Select select;
	public static Actions actions;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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
	
	public void pause(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public void dragDrop(WebElement element, int index) {
		select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void textClear(WebElement element) {
		element.clear();
	}
	
	public void doubleClick(WebElement element) {
		actions=new Actions(driver);
		actions.doubleClick(element);
	}
	
	public String getAttri(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
				
	}
		
	public List<WebElement> multiElements(String xpath1) {
		List<WebElement> eleList = driver.findElements(By.xpath(xpath1));
		return eleList;
		
	}
	
	
	public void printText(String att) {
		System.out.println(att);
	}
	
	public void imPause(long seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	
	}
	
	
	
	
	
	
	public String excelText(int rowNo, int dataNo) throws IOException {
		File file=new File("C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\Excel File\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(dataNo);
		CellType type = cell.getCellType();
		String value=null;
		switch (type) {
		case STRING:
			 value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat format=new SimpleDateFormat("dd-MM-YYYY");
				 value = format.format(date);
				
			}else {
				double numeric = cell.getNumericCellValue();
				BigDecimal numericValue = BigDecimal.valueOf(numeric);
				value = numericValue.toString();
			}
			
			break;
		default:
			break;
		}
		return value;

		}
		
	public void excelWrite(String sheetName,String value) throws IOException {
		File file=new File("C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\Excel File\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		for (int i = 0; i <10; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j <10; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(value);
			}
			
			
		}
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);	
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}

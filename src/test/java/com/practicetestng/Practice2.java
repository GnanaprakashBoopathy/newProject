package com.practicetestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.facebook.com/");
	File file =new File("C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\Excel File\\Book1.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			if (j==0) {
				Date date=new Date();
				System.out.println("The Start time is "+date);
				Cell cell = row.getCell(j);
				System.out.println("The username is "+cell);
				driver.findElement(By.id("email")).sendKeys(cell.toString());
				
			}else if (j==1) {
				Cell cell = row.getCell(j);
				System.out.println("The password is "+cell);
				driver.findElement(By.id("pass")).sendKeys(cell.toString());

			}
			
		}
		driver.findElement(By.name("login")).click();
			
//		WebElement login1 = driver.findElement(By.name("login"));
//		boolean enabled = login1.isEnabled();
//		driver.navigate().back();
		driver.navigate().refresh();
		boolean enabled=true;
		if (enabled==true) {
			Sheet sheet1 = workbook.getSheet("Sheet1");
			Row createRow = sheet1.createRow(i);
			Cell createCell = createRow.createCell(4);
			createCell.setCellValue("Not cleared");
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
			
		} else {
			Sheet sheet1 = workbook.getSheet("Sheet1");
			Row createRow = sheet1.createRow(i);
			Cell createCell = createRow.createCell(4);
			createCell.setCellValue("cleared");
			FileOutputStream out=new FileOutputStream(file);
			workbook.write(out);
			
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		Date date1=new Date();
		System.out.println("The end time is "+date1);
		
		
	}
			
}
}

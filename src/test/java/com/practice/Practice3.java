package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file=new File("C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\Excel File\\maven excel.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("datas");
		for (int i = 0; i < 25; i++) {
			Row createRow = sheet.createRow(i);
			Cell cell = createRow.createCell(0);
			cell.setCellValue(i);
			System.out.println(i);
		}
	
	FileOutputStream out=new FileOutputStream(file);
	workbook.write(out);
	
	}
	
	
	
	
	
}

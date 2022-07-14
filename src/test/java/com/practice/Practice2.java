package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"C:\\Users\\Dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\Excel File\\maven excel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String string = cell.getStringCellValue();
					System.out.println(string);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dt = new SimpleDateFormat("dd-MMMM-yYYY");
						String string2 = dt.format(date);
						System.out.println(string2);

					} else {
						double numericCellValue = cell.getNumericCellValue();
						long numbers = (long) numericCellValue;
						String valueOf = String.valueOf(numbers);
						System.out.println(valueOf);

					}
					break;
				default:
					break;
				}
			}
		}

	}
}

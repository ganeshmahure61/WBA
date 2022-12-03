package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider () throws Exception {
		
		String filepath = "C:\\Users\\GANESH MAHURE\\Desktop\\Eclipse\\WBA-US\\Health_Care\\TestData\\Data.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		wb = new XSSFWorkbook(fis);
	}
	public String getStringData(String SheetName, int row, int cell) {
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	

}

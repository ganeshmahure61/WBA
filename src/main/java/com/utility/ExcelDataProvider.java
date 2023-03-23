package com.utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider () throws Exception 
	{	
		String filepath = "C:\\Users\\PM\\eclipse-workspace\\WBA\\TestData\\Data.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		wb = new XSSFWorkbook(fis);	
	}
	
	public String getStringData(String SheetName, int row, int cell) 
	{
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	

}

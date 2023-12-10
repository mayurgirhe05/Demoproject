package com.all_methods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class ReadExcelFile {

	public void test01() throws Exception{
		DataFormatter df=new DataFormatter();
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Mayur\\Desktop\\Test.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		 
		int rows =sheet.getLastRowNum();
		for(int i=0;i<=rows;i++){
			int cols=sheet.getRow(i).getLastCellNum();
			
			for(int j=0;j<cols;j++){
				Cell cell=sheet.getRow(i).getCell(j);
				System.out.print(df.formatCellValue(cell)+  "        ");
			}
			System.out.println();
		}
	}
	
}

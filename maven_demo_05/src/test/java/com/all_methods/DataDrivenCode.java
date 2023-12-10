package com.all_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenCode {
	@Test
	public void test01(){
		
		XSSFWorkbook ExcelWorkbook=null;
		XSSFSheet ExcelWorkSheet=null;
		XSSFRow Row;
		XSSFCell Cell;
		
		// create an object of File class to open file
		
		File excelFile=new File("C:\\Users\\Mayur\\Desktop\\UsersData.xlsx");
		
		FileInputStream inputStream=null;
		
		//create object of file input stream to read data from File
		
		try {
			 inputStream=new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Excel--> Workbook-->Sheet-->row -->cell
		
		try {
			ExcelWorkbook=new XSSFWorkbook(inputStream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ExcelWorkSheet = ExcelWorkbook.getSheetAt(0);
		
		//get total row count
		
		int totalRows=ExcelWorkSheet.getLastRowNum()  +1;
		
		int totalCells=ExcelWorkSheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<totalRows;i++){
			for(int j=0;j<totalCells;j++){
				System.out.print(ExcelWorkSheet.getRow(i).getCell(j).toString());
				System.out.print("\t");
				
			
			}
			
			System.out.println();
		}
		try {
			ExcelWorkbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

package com.all_methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class ExcelWrite {
	
	Sheet sh=null;
	Row row= null;
	Cell c= null;

	public void writeCellData(String sheetname, int rowNum, int col, String data)throws Exception {
		FileInputStream fis = new FileInputStream("Test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		if(wb.getSheet(sheetname)==null) {
			sh=wb.createSheet(sheetname);
			row= sh.createRow(rowNum);
			c= (Cell) row.createCell(col);
		}
		else {
			sh= wb.getSheet(sheetname);
			if(sh.getRow(rowNum)==null) {
				row= sh.createRow(rowNum);
				c= (Cell) row.createCell(col);
			}
			else {
				row=sh.getRow(rowNum);
				if(row.getCell(col)==null)
					c= (Cell) row.createCell(col);
				else
					c=(Cell) row.getCell(col);
			}
		}
		((org.apache.poi.ss.usermodel.Cell) c).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("Test.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}
	
	
	@Test
	public void test01()throws Exception {
		
		writeCellData("JBK", 3, 5,"TheKiranAcademy");
		writeCellData("JBK", 3, 6,"Selenium Automation");
	}
	
}



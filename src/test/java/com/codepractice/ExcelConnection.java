package com.codepractice;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnection {

	
public static void main(String[] args) throws Throwable, Throwable, Throwable {
	
	FileInputStream fis=new FileInputStream("");
	
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("");
	String s =sh.getRow(3).getCell(4).getStringCellValue();
	System.out.println(s);
	
}
	
	
	
	
}

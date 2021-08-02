package com.yograj.assginment.Assginment5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {

	private static Workbook wb;
	private static Sheet sh;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Row row;
	private static Cell cell;
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
		fis = new FileInputStream("./studentdata1.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet1");
		int noOfRows = sh.getLastRowNum();
		System.out.println(noOfRows);
		for(int i=1; i<=noOfRows; i++) {
			System.out.println("***********************");
			System.out.println(sh.getRow(i).getCell(0));
			System.out.println("***********************");
			System.out.println(sh.getRow(i).getCell(1));
			System.out.println(sh.getRow(i).getCell(2));
			System.out.println(sh.getRow(i).getCell(3));
			System.out.println(sh.getRow(i).getCell(4));
			System.out.println(sh.getRow(i).getCell(5));
			System.out.println(sh.getRow(i).getCell(6));
			System.out.println(sh.getRow(i).getCell(7));
			System.out.println("***********************");
		}
		
		
	}

}
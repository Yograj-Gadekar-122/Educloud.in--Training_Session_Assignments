package com.yograj.assginment.Assginment4;

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

public class CreateExcel {

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
		
		row = sh.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("Sr No");
		cell = row.createCell(1);
		cell.setCellValue("Roll_no");
		cell = row.createCell(2);
		cell.setCellValue("Student_Name");
		cell = row.createCell(3);
		cell.setCellValue("College_Name");
		cell = row.createCell(4);
		cell.setCellValue("DOB");
		cell = row.createCell(5);
		cell.setCellValue("Contact_no");
		cell = row.createCell(6);
		cell.setCellValue("Email_id");
		
		row = sh.createRow(2);
		cell = row.createCell(0);
		cell.setCellValue("01");
		cell = row.createCell(1);
		cell.setCellValue("08");
		cell = row.createCell(2);
		cell.setCellValue("Yograj Gadekar");
		cell = row.createCell(3);
		cell.setCellValue("SND COE & RC YEOLA");
		cell = row.createCell(4);
		cell.setCellValue("22/08/1998");
		cell = row.createCell(5);
		cell.setCellValue("7896654125");
		cell = row.createCell(6);
		cell.setCellValue("yograjgadekar@gmail.com");
		
		row = sh.createRow(3);
		cell = row.createCell(0);
		cell.setCellValue("02");
		cell = row.createCell(1);
		cell.setCellValue("10");
		cell = row.createCell(2);
		cell.setCellValue("Samadhan Kadam");
		cell = row.createCell(3);
		cell.setCellValue("SND COE & RC YEOLA");
		cell = row.createCell(4);
		cell.setCellValue("25/3/2000");
		cell = row.createCell(5);
		cell.setCellValue("9182635495");
		cell = row.createCell(6);
		cell.setCellValue("kadamsam@gmail.com");
		
		row = sh.createRow(4);
		cell = row.createCell(0);
		cell.setCellValue("03");
		cell = row.createCell(1);
		cell.setCellValue("22");
		cell = row.createCell(2);
		cell.setCellValue("Amit Patil");
		cell = row.createCell(3);
		cell.setCellValue("SND COE & RC YEOLA");
		cell = row.createCell(4);
		cell.setCellValue("15/03/1996");
		cell = row.createCell(5);
		cell.setCellValue("7785896632");
		cell = row.createCell(6);
		cell.setCellValue("amitpatil@gmail.com");
		
		row = sh.createRow(5);
		cell = row.createCell(0);
		cell.setCellValue("04");
		cell = row.createCell(1);
		cell.setCellValue("24");
		cell = row.createCell(2);
		cell.setCellValue("Ajinath Sawant");
		cell = row.createCell(3);
		cell.setCellValue("SND COE & RC YEOLA");
		cell = row.createCell(4);
		cell.setCellValue("01/08/1998");
		cell = row.createCell(5);
		cell.setCellValue("7758964125");
		cell = row.createCell(6);
		cell.setCellValue("sawantajm1@gmail.com");
		
		
		
		System.out.println(cell.getStringCellValue());
		fos = new FileOutputStream("./studentdata1.xlsx");
		wb.write(fos);
		fos.flush();
		fos.close();
		
		System.out.println("Done");
		

	}

}

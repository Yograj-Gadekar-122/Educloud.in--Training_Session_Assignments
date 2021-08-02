 package com.yograj.assginment.JasperAssignment.HelloWord;

import java.io.IOException;
import java.net.URISyntaxException;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class HelloWordController {

	public static void main(String[] args) throws URISyntaxException, JRException, IOException{
		
//		HelloWordService helloWordService = new HelloWordService();
//		
//		String desPath = helloWordService.startGenrateingPDF();
//		
//		System.out.println("PDF is created At Path :" +desPath);
		
		JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\Raj\\Documents\\GitHub\\ec-batch-1-Yograj-Gadekar-122\\src\\main\\java\\com\\yograj\\assginment\\JasperAssignment\\JasperIntroduction\\RegistrationReport.jrxml");
		
		JRDataSource jrDataSource = new JREmptyDataSource() ;
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jrDataSource);
		
		JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\\\Users\\\\Raj\\\\Documents\\\\GitHub\\\\ec-batch-1-Yograj-Gadekar-122\\\\src\\\\main\\\\java\\\\com\\\\yograj\\\\assginment\\\\JasperAssignment\\\\JasperIntroduction\\\\RegistrationReport.pdf");
		
		System.out.println("PDF is Created... ");

	}

}

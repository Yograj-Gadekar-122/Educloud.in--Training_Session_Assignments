 package com.yograj.assginment.JasperAssignment.HelloWord;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class HelloWordController {

	public static void main(String[] args) throws JRException  {
		
//		HelloWordService helloWordService = new HelloWordService();
//		
//		String desPath = helloWordService.startGenrateingPDF();
//		
//		System.out.println("PDF is created At Path :" +desPath);
		
		JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\Raj\\Documents\\GitHub\\ec-batch-1-Yograj-Gadekar-122\\src\\main\\java\\com\\yograj\\assginment\\JasperAssignment\\JasperIntroduction\\helloWordJasper.jrxml");
		
		JRDataSource jrDataSource = new JREmptyDataSource() ;
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jrDataSource);
		
		JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\\\Users\\\\Raj\\\\Documents\\\\GitHub\\\\ec-batch-1-Yograj-Gadekar-122\\\\src\\\\main\\\\java\\\\com\\\\yograj\\\\assginment\\\\JasperAssignment\\\\JasperIntroduction\\\\helloWordJasper.pdf");
		
		System.out.println("PDF is Created... ");

	}

}

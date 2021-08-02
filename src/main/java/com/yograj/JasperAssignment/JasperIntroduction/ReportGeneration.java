package com.yograj.assginment.JasperAssignment.JasperIntroduction;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class ReportGeneration {
	public static void main(String[] args) throws JRException
	{
		JasperReport jasperReport = JasperCompileManager.compileReport("C:C:\\Users\\Raj\\Documents\\GitHub\\ec-batch-1-Yograj-Gadekar-122\\src\\main\\java\\com\\yograj\\assginment\\JasperAssignment\\JasperIntroduction\\RegistrationReport.jrxml");
		
		JRDataSource jrDataSource = new JREmptyDataSource() ;
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jrDataSource);
		
		JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\\\Users\\\\Raj\\\\Documents\\\\GitHub\\\\ec-batch-1-Yograj-Gadekar-122\\\\src\\\\main\\\\java\\\\com\\\\yograj\\\\assginment\\\\JasperAssignment\\\\JasperIntroduction\\\\RegistrationReport.pdf");
		

		
	}


}

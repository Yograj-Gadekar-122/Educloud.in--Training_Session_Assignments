package com.yograj.assginment.JasperAssignment.JasperAssignment10;


import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class Assign10Service {

	public static String destinationPath="C:\\Users\\Raj\\Documents\\GitHub\\ec-batch-1-Yograj-Gadekar-122\\src\\main\\java\\com\\yograj\\assginment\\JasperAssignment\\JasperAssignment10\\Assign10.pdf";
	public String startGeneratingPdf() throws URISyntaxException, JRException, IOException {
		
		String JrxmlPath=getJrxmlLocationPath();
		
		JasperDesign jasperDesign= getJasperDesign(JrxmlPath);
	
		JasperReport jasperReport=compileJasperDesign(jasperDesign);
		
		Map<String,Object> parameterMap=getParameterMap();
		
		JRDataSource dataSource=getEmptyDataSource();
		
		JasperPrint jasperPrint=buildReport(jasperReport,parameterMap,dataSource);	
		
		String exportPath=exportReportPdf(jasperPrint);
		
		return exportPath;
		
	}

	private String exportReportPdf(JasperPrint jasperPrint) throws JRException {
		JasperExportManager.exportReportToPdfFile(jasperPrint, destinationPath);
		return destinationPath;
	}

	private JasperPrint buildReport(JasperReport jasperReport, Map<String, Object> parameterMap, JRDataSource dataSource) throws JRException {
		return JasperFillManager.fillReport(jasperReport, parameterMap, dataSource);
	}

	private JRDataSource getEmptyDataSource() {
		JRDataSource dataSource=new JREmptyDataSource();
		return dataSource;
	}

	private Map<String, Object> getParameterMap() {
		Map<String,Object> parameterMap=new HashMap<String,Object>();
		return parameterMap;
	}

	private JasperReport compileJasperDesign(JasperDesign jasperDesign) throws JRException {
		return JasperCompileManager.compileReport(jasperDesign);
	}

	private JasperDesign getJasperDesign(String jrxmlPath) throws JRException, IOException {
		
		InputStream inputStream=new FileInputStream(new File(jrxmlPath));
		JasperDesign jasperDesign=JRXmlLoader.load(inputStream);
		inputStream.close();
		return jasperDesign;
	}

	private String getJrxmlLocationPath() throws URISyntaxException {
		
		String path=getClass().getClassLoader().getResource("Assign10.jrxml").toURI().getPath();
		
		return path;
	}
}

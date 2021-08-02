package com.yograj.assginment.JasperAssignment.JasperAssignment18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class CrossTabService {

	private static final String String = null;
	public static String destinationPath = "C:\\Users\\Raj\\Documents\\GitHub\\ec-batch-1-Yograj-Gadekar-122\\src\\main\\java\\com\\yograj\\assginment\\JasperAssignment\\JasperAssignment18\\crosstab1.pdf";
	
	public String startGeneratingpdf() throws URISyntaxException, JRException, IOException {
		
		//jrxml location
		String jrxmlPath = getJrxmlLocationPath();
		
		//load jasper design
		JasperDesign jasperDesign= getJasperDesign(jrxmlPath);
	
		//compile jasper
		JasperReport jasperReport = compileJasperDesign(jasperDesign);
		
		//parametermap
		Map<String, Object> parameterMap = getParameterMap();
		
		//empty data source
		JRDataSource dataSource = getJRBeanDataSource();
		//JRDataSource dataSource1 = getJRBeanDataSource1();
		
		//jasper reportfill
		JasperPrint jasperPrint = builReport(jasperReport, parameterMap, dataSource);
		
//		JasperPrint jasperPrint1 = builReport1(jasperReport, parameterMap, dataSource1);
		
		//export to pdf
		String exportPath = exportReportPdf(jasperPrint);
		
//		String exportPath = exportReportPdf(jasperPrint, jasperPrint1);
		
		return exportPath;
		
	}

	private String exportReportPdf(JasperPrint jasperPrint) throws JRException {
		
		JasperExportManager.exportReportToPdfFile(jasperPrint, destinationPath);
		
		return destinationPath;
	}

	private JasperPrint builReport(JasperReport jasperReport, Map<String, Object> parameterMap, JRDataSource dataSource) throws JRException {
		
		return JasperFillManager.fillReport(jasperReport, parameterMap, dataSource);
	}

	private JRDataSource getJRBeanDataSource() {
		List<DataBean> dataBeanList = getDataBeanList();
		//List<DataBean> dataBeanList1 = getDataBeanList1();
		JRDataSource dataSource = new JRBeanCollectionDataSource(dataBeanList, false);
		//JRDataSource dataSource1 = new JRBeanCollectionDataSource(dataBeanList1, false);
		return dataSource;
}
//	private JRDataSource getJRBeanDataSource1() {
//		List<DataBean> dataBeanList = getDataBeanList();
//		List<DataBean> dataBeanList1 = getDataBeanList1();
//		JRDataSource dataSource = new JRBeanCollectionDataSource(dataBeanList, false);
//		JRDataSource dataSource1 = new JRBeanCollectionDataSource(dataBeanList1, false);
//  	   
//		return dataSource1;
//}

	
	private List<DataBean> getDataBeanList() {
		List<DataBean> dataBeans = new ArrayList<DataBean>();
		
		dataBeans.add(singleDataBean ("HandWriting","Cycle 1","B","HandWriting","Cycle 1","E"));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 2","E","HandWriting","Cycle 2","B"));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 3","B","HandWriting","Cycle 3","O"));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 4","G","HandWriting","Cycle 4","T"));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 5","Q","HandWriting","Cycle 5","D"));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 6","G","HandWriting","","-"));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 7","G","HandWriting","",""));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 8","G","HandWriting","",""));
		dataBeans.add(singleDataBean ("HandWriting","Cycle 9","G","HandWriting","",""));
		
		dataBeans.add(singleDataBean ("Spelling","Cycle 1","G","Spelling","Cycle 1","J"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 2","J","Spelling","Cycle 2","G"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 3","L","Spelling","Cycle 3","T"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 4","V","Spelling","Cycle 4","Y"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 5","L","Spelling","Cycle 5","B"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 6","L","Spelling","","-"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 7","L","Spelling","","-"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 8","L","Spelling","","-"));
		dataBeans.add(singleDataBean ("Spelling","Cycle 9","L","Spelling","","-"));
		
		dataBeans.add(singleDataBean ("Listening","Cycle 1","L","Listening","Cycle 1","O"));
		dataBeans.add(singleDataBean ("Listening","Cycle 2","O","Listening","Cycle 2","L"));
		dataBeans.add(singleDataBean ("Listening","Cycle 3","Q","Listening","Cycle 3","Y"));
		dataBeans.add(singleDataBean ("Listening","Cycle 4","A","Listening","Cycle 4","D"));
		dataBeans.add(singleDataBean ("Listening","Cycle 5","Q","Listening","Cycle 5","G"));
		dataBeans.add(singleDataBean ("Listening","Cycle 6","Q","Listening","","-"));
		dataBeans.add(singleDataBean ("Listening","Cycle 7","Q","Listening","","-"));
		dataBeans.add(singleDataBean ("Listening","Cycle 8","Q","Listening","","-"));
		dataBeans.add(singleDataBean ("Listening","Cycle 9","Q","Listening","","-"));
		
		dataBeans.add(singleDataBean ("Writing","Cycle 1","Q","Writing","Cycle 1","T"));
		dataBeans.add(singleDataBean ("Writing","Cycle 2","T","Writing","Cycle 2","Q"));
		dataBeans.add(singleDataBean ("Writing","Cycle 3","E","Writing","Cycle 3","D"));
		dataBeans.add(singleDataBean ("Writing","Cycle 4","E","Writing","Cycle 4","B"));
		dataBeans.add(singleDataBean ("Writing","Cycle 5","E","Writing","Cycle 5","T"));
		dataBeans.add(singleDataBean ("Writing","Cycle 6","E","Writing","","-"));
		dataBeans.add(singleDataBean ("Writing","Cycle 7","E","Writing","","-"));
		dataBeans.add(singleDataBean ("Writing","Cycle 8","E","Writing","","-"));
		dataBeans.add(singleDataBean ("Writing","Cycle 9","E","Writing","","-"));
		
		dataBeans.add(singleDataBean ("Reading","Cycle 1","V","Reading","Cycle 1","Y"));
		dataBeans.add(singleDataBean ("Reading","Cycle 2","Y","Reading","Cycle 2","V"));
		dataBeans.add(singleDataBean ("Reading","Cycle 3","J","Reading","Cycle 3","B"));
		dataBeans.add(singleDataBean ("Reading","Cycle 4","J","Reading","Cycle 4","G"));
		dataBeans.add(singleDataBean ("Reading","Cycle 5","J","Reading","Cycle 5","Y"));
		dataBeans.add(singleDataBean ("Reading","Cycle 6","J","Reading","","-"));
		dataBeans.add(singleDataBean ("Reading","Cycle 7","J","Reading","","-"));
		dataBeans.add(singleDataBean ("Reading","Cycle 8","J","Reading","","-"));
		dataBeans.add(singleDataBean ("Reading","Cycle 9","J","Reading","","-"));
		
		dataBeans.add(singleDataBean ("Speaking","Cycle 1","A","Speaking","Cycle 1","D"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 2","D","Speaking","Cycle 2","A"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 3","O","Speaking","Cycle 3","G"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 4","O","Speaking","Cycle 4","L"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 5","O","Speaking","Cycle 5","D"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 6","O","Speaking","","-"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 7","O","Speaking","","-"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 8","O","Speaking","","-"));
		dataBeans.add(singleDataBean ("Speaking","Cycle 9","O","Speaking","","-"));	
		
		return dataBeans;
	}
	
	
	
	
	private DataBean singleDataBean(String row, String column, String value, String row1, String column1, String value1 ) {
		
		DataBean dataBean =new DataBean();
		dataBean.setRowHeader(row);
		dataBean.setColumnHeader(column);
		dataBean.setValue(value);
		
		//DataBean dataBeans = new DataBean();
		dataBean.setRowHead_1(row1);
		dataBean.setColumnHead_1(column1);
		dataBean.setValue_1(value1);
	
		return dataBean;
	}
	
	private List<DataBean> getDataBeanList1() {
		List<DataBean> dataBeans = new ArrayList<DataBean>();
			return dataBeans;
	}

//	private DataBean multipleDataBean(String row1, String column1, String value1) {
//		
//		DataBean dataBean = new DataBean();
//		dataBean.setRowHead_1(row1);
//		dataBean.setColumnHead_1(column1);
//		dataBean.setValue_1(value1);		
//		return dataBean;
//	}
//	
	private Map<String, Object> getParameterMap() {
		
		Map<String, Object> parameterMap= new HashMap<String, Object>();

		return parameterMap;
	}

	private JasperReport compileJasperDesign(JasperDesign jasperDesign) throws JRException {
		
		return JasperCompileManager.compileReport(jasperDesign);
	}

	private JasperDesign getJasperDesign(String jrxmlPath) throws JRException, IOException {
	
		InputStream inputStream =new FileInputStream(new File(jrxmlPath));
		JasperDesign jasperDesign= JRXmlLoader.load(inputStream);
		inputStream.close();
	
		return jasperDesign;
	}

	private String getJrxmlLocationPath() throws URISyntaxException {
		
		String path = getClass().getClassLoader().getResource("CrossTab.jrxml").toURI().getPath();

		return path;
	}
}
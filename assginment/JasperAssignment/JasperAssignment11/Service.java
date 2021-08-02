package com.yograj.assginment.JasperAssignment.JasperAssignment11;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

	 public class Service {

	 	public static void main(String[] args) throws JRException  {
	 		
	 		String filePath = "C:\\Users\\Raj\\Documents\\GitHub\\ec-batch-1-Yograj-Gadekar-122\\src\\main\\java\\com\\yograj\\assginment\\JasperAssignment\\JasperAssignment11\\Assignment11.jrxml";
	 		File file = new File(filePath);
	 		
	 		try {
	 			JasperDesign jasperDesign = JRXmlLoader.load(file);
	 			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
	 			
	 			List<Controller> controller = new ArrayList<Controller>();
	 			Controller mainController = new Controller();
	 			
	 			mainController.setRandomText("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur? ");	
	 			mainController.setImageURL("F:/Downloads/Java Download Video/Working With Data/Educloud1.png");
	 			mainController.setClgname(" Barry Clarric Maddy State School\r\n" + "Student Progress Report\r\n" + "Mathematics Progress Card");
	 			mainController.setName("Emma B.");
	 			mainController.setRoll_no("11");
	 			mainController.setDiv("A");
	 			mainController.setAdmi_id("A245");
	 			mainController.setCource("9");
	 			mainController.setDate("27-Feb-2021");
	 			mainController.setKey0("Principal");
	 			mainController.setKey1("Class Teacher");
	 			mainController.setKey2("Subject Teacher");
	 			mainController.setValue0("Dhaval Patel");
	 			mainController.setValue1("Urvesh Rathod");
	 			mainController.setValue2("Heena Lanjewar");		
	 			
	 			controller.add(mainController);
	 			
	 			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(controller);
	 			
	 			Map<String, Object> paraMap = new HashedMap<String, Object>();
	 			
	 			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paraMap, dataSource);
	 			
	 			JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Users/Raj/Documents/GitHub/ec-batch-1-Yograj-Gadekar-122/src/main/java/com/yograj/assginment/JasperAssignment/JasperAssignment11/Assign11.pdf");
	 			
	 			System.out.println("PDF Generated....");
	 		}catch (JRException e) {
				e.printStackTrace();
			}
	 		
	 	}

}
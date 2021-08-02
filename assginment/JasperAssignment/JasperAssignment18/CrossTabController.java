package com.yograj.assginment.JasperAssignment.JasperAssignment18;

import java.io.IOException;
import java.net.URISyntaxException;

import net.sf.jasperreports.engine.JRException;

public class CrossTabController {

	public static void main(String[] args) throws URISyntaxException, JRException, IOException {
		
		CrossTabService CS = new CrossTabService(); 
		String desPath = CS.startGeneratingpdf();
		System.out.println("Pdf is created at Path :" + desPath);

	}	

}
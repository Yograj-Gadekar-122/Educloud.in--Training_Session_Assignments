package com.yograj.assginment.JasperAssignment.JasperAssignment10;

import java.io.IOException;
import java.net.URISyntaxException;
import net.sf.jasperreports.engine.JRException;

public class DetailReport {

	public static void main(String[] args) throws URISyntaxException, IOException, JRException {

				Assign10Service sr=new Assign10Service();
				String path=sr.startGeneratingPdf();
				System.out.println("pdf generated at path "+ path);
	}
}

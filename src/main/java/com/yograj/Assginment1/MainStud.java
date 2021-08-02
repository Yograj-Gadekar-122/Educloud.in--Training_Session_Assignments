package com.yograj.ec.training.Assginment1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.http.client.ClientProtocolException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class MainStud {

	private static final String JSONArray = null;

	public static void main(String[] args) throws ClientProtocolException, IOException, ParseException {
		
		Student std = new Student();
		Courses crc = new Courses();
		ExamResult er = new ExamResult();
		er.getStringObject();
	
		
		FileReader reader = new FileReader(".\\jsonfile\\studentAndCourseJSON.json");
		
		JSONParser jsonparser = new JSONParser();
				
		Object obj = jsonparser.parse(reader);
		
		JSONArray studjsonobj = (JSONArray)obj;
		
		JSONArray studarray = (JSONArray)(obj)  ; 	
		System.out.println(studarray);
		
		Iterator<String> unitsIterator = studarray.iterator();
		
	}		
	
	private static void parseStudObj(JSONObject stud) {
		
		JSONObject studobj= (JSONObject) stud.get("students");
		
		String id = (String) studobj.get("id");
		String firstname = (String) studobj.get("firstname");
		String lastname = (String) studobj.get("lastname");
		String dob = (String) studobj.get("dob");
		String contact = (String) studobj.get("Contact");
		String email = (String) studobj.get("Email");
		
		System.out.println("Student of " + studobj + "is .......");
		
		System.out.println("Id: " +id );
		System.out.println("First Name: " +firstname );
		System.out.println("Last Name: " +lastname );
		System.out.println("DOB: " +dob );
		System.out.println("Contact: " +contact );
		System.out.println("Email: " +email );
		
	}
	
private static void parseCrcObj(JSONObject crc) {
		
		JSONObject crcobj= (JSONObject) crc.get("courses");
		
		String id = (String) crcobj.get("id");
		String name = (String) crcobj.get("name");
		String duration = (String) crcobj.get("duration");
		
		System.out.println("Courses of Student " + crcobj + "is .......");
		System.out.println("Id: " +id );
		System.out.println("Name: " +name );
		System.out.println("Duration: " +duration );

		
	}	
}

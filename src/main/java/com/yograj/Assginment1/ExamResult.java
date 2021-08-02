
package com.yograj.ec.training.Assginment1;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ExamResult {

	public Student getStringObject() throws ParseException, IOException {
		

	/*String url  = "https://s3.ap-south-1.amazonaws.com/const.educloud.in/api/studentAndCourseJSON.json";     //Student + Courses
	
	String json_response= getJsonResponse(url);
	
	CloseableHttpClient httpclient = HttpClients.createDefault();	
    HttpGet httpGet = new HttpGet(url);

	CloseableHttpResponse response1 = httpclient.execute(httpGet);
    HttpEntity entity1 = response1.getEntity();
      
    String content = EntityUtils.toString(entity1);
    System.out.println(content);

    Gson gson = new Gson(); 
    Student stud = gson.fromJson(json_response, Student.class);
	
	return null;
}

private String getJsonResponse(String url) throws IOException, ClientProtocolException {
	
	
	//String url1  = "https://s3.ap-south-1.amazonaws.com/const.educloud.in/api/studentAndCourseJSON.json";
	
	CloseableHttpClient httpclient = HttpClients.createDefault();	
    HttpGet httpGet = new HttpGet(url);

	CloseableHttpResponse response1 = httpclient.execute(httpGet);
    HttpEntity entity1 = response1.getEntity();
      
    String content = EntityUtils.toString(entity1);
    System.out.println(content);
	return content;
}

public List<Student> getListOfStatus() throws ClientProtocolException, IOException{
	
	String url = "https://s3.ap-south-1.amazonaws.com/const.educloud.in/CourseAndExamsJSON.json";
	String json_response = getJsonResponse(url);
	
	Gson gson = new Gson(); 
    List<Student> studList = gson.fromJson(json_response, List.class); 
    
    Type userListType = new TypeToken<ArrayList<String>>() {}.getType();
    
    ArrayList<Student> studList1 = gson.fromJson(json_response, userListType);

    Student stud = gson.fromJson(json_response, Student.class);
 	
	System.out.println(stud.getFirstname());              
    System.out.println(stud.getLastname());   
    /*System.out.println(stud.getDob()); 
    System.out.println(stud.getContact());
    System.out.println(stud.getEmail());*/
    
	return null ;
}

}

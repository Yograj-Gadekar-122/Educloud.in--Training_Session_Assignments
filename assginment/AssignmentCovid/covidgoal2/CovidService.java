package com.yograj.covidgoal2;


import java.io.IOException;
import java.lang.reflect.Type;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class CovidService
{

	//private String json_response;

	public State getStateObject() throws ClientProtocolException, IOException	{
		
		String url = "https://s3.ap-south-1.amazonaws.com/const.educloud.in/api/State-Covid.json";
		
		String json_response= getJsonResponse(url);
	
        Gson gson = new Gson();  
        State State = gson.fromJson(json_response, State.class);
 	
	
		return null;
	}

	private String getJsonResponse(String url) throws IOException, ClientProtocolException {
		CloseableHttpClient httpclient = HttpClients.createDefault();	
	    HttpGet httpGet = new HttpGet(url);

		CloseableHttpResponse response1 = httpclient.execute(httpGet);
	    HttpEntity entity1 = response1.getEntity();
	      
	    String content = EntityUtils.toString(entity1);
        System.out.println(content);
		return content;
	}
	
	public List<State> getListOfStatus() throws ClientProtocolException, IOException{
		String url = "https://s3.ap-south-1.amazonaws.com/const.educloud.in/api/State-Covid.json";
		String json_response = getJsonResponse(url);
		
		Gson gson = new Gson(); 
        List<State> stateList = gson.fromJson(json_response, List.class); 
        
        Type userListType = new TypeToken<ArrayList<State>>() {}.getType();
        
        ArrayList<State> stateList1 = gson.fromJson(json_response, userListType);

       /* for(State state : stateList1) {
    	   
    	   System.out.println(state.getName());              
           System.out.println(state.getCapital());   
           System.out.println(state.getPopulation()); 
           System.out.println(state.getCovid());
       	
       	   
       }*/
        
		return stateList1; 
	}

}

package com.yograj.covidgoal2;


import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

public class Handler {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		 Handler handler = new Handler();
		 
		 //handler.goal1();
		 
		 handler.goal2();
		 
	}
	
	private void goal2() throws ClientProtocolException, IOException {
		CovidService assginmentService = new CovidService();
		List<State> stateList = assginmentService.getListOfStatus();
	
		for(State state : stateList) {
	    	   
	    	   System.out.println(state.getName());              
	           System.out.println(state.getCapital());   
	           System.out.println(state.getPopulation()); 
	           System.out.println(state.getCovid());
	       		       	   
	       }
		
	}

	private void goal1() throws ClientProtocolException, IOException {
		
		CovidService assginmentService = new CovidService();
		List<State> stateList = (List<State>) assginmentService.getStateObject();
		
		for(State state : stateList) {
        	
        	System.out.println(state.getName());              
            System.out.println(state.getCapital());   
            System.out.println(state.getPopulation()); 
            System.out.println(state.getCovid());
        }
		
	}

}

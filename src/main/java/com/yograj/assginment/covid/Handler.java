package com.yograj.assginment.covid;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class Handler {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		CovidAssginmentService assginmentService = new CovidAssginmentService();
		assginmentService.getStringObject();
		
	}

}

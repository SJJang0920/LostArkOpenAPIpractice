package com.mypractice.lostarkapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

public class RequestOpenSource {
	public String requestOS(String detailURL) throws IOException{
		URL url = new URL("https://developer-lostark.game.onstove.com/"+ detailURL);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();  
		conn.setRequestMethod("GET");
		conn.setRequestProperty("accept", "application/json");
		conn.setRequestProperty("authorization", "bearer "+APIKey.APIkey());
		
		BufferedReader rd; 
		if(conn.getResponseCode() >= 200 & conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8")); 
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream())); 
		}
		StringBuffer result = new StringBuffer(); 
		String strResult = ""; 
		String line; 
		while((line = rd.readLine()) != null) {
			result.append(line); 
		 } 
		rd.close(); 
		conn.disconnect(); 
		strResult = result.toString(); 
		System.out.println(strResult);
		return strResult;
	}
}

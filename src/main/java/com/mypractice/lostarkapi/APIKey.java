package com.mypractice.lostarkapi;

import java.io.BufferedReader;
import java.io.FileReader;

public class APIKey {
	public static String APIkey() throws Exception{
		String APIkey;
		FileReader fs = new FileReader("apikey.txt");
		BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\com\\mypractice\\lostarkapi\\apikey.txt"));
		APIkey = br.readLine();
		fs.close();
		br.close();
		return APIkey;
	}
}

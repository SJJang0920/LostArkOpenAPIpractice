package com.mypractice.lostarkapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class APIKey {
	public static String APIkey(){
		String APIkey = "";
		BufferedReader br;
		File file = new File("D:\\lostarkapi\\LostarkAPIPractice\\src\\main\\java\\apikey.txt");
		try {
			br = new BufferedReader(new FileReader(file));
			APIkey = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return APIkey;
	}
}

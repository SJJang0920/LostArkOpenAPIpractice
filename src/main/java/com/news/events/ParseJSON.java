package com.news.events;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mypractice.lostarkapi.RequestOpenSource;

public class ParseJSON {
	public void parse() throws IOException, ParseException {
		RequestOpenSource requestOS = new RequestOpenSource();
		String detailURL = "news/events";
		String events = requestOS.requestOS(detailURL);
		JSONParser parser = new JSONParser();
		JSONArray root = (JSONArray) parser.parse(events);
		for(Object event : root) {
			JSONObject eventObj = (JSONObject) event;
			String title = (String) eventObj.get("Title");
			String thumbnail = (String) eventObj.get("Thumbnail");
			String link = (String) eventObj.get("Link");
			String startdate = (String) eventObj.get("StartDate");
			String enddate = (String) eventObj.get("EndDate");
			String rewarddate = (String) eventObj.get("RewardDate");
		}
	}
}

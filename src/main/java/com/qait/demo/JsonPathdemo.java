package com.qait.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class JsonPathdemo {
	
	@Test
	public  void testJsonPath() throws FileNotFoundException, IOException, ParseException {
		
		
	    	JSONParser jsonparser = new JSONParser();	
	    	
			JSONObject obj = (JSONObject)(jsonparser.parse(new FileReader("Json Path files/jsonfile.json")));
			JSONObject list = (JSONObject) obj.get("properties");
			JSONObject list2 = (JSONObject) ((JSONObject)list.get("object")).get("properties");
			System.out.println(list2.get("a"));
//			JSONArray list2 = (JSONArray) list.get("");
//			System.out.println(list2);
//			for(Object ls:list2)
//			{
//				System.out.println(ls);
//			}
			String str =  (String) obj.get("type");
			System.out.println(str);

		
		 
		 
	}

}

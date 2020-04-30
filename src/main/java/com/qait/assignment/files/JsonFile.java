package com.qait.assignment.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFile {
	
	File file;
	FileWriter fw;
	JSONParser parser;
	JSONObject obj;
	JSONObject details;
	
	JsonFile() throws FileNotFoundException, IOException, ParseException{
		
	file = new File("SampleFiles/file.json");
	parser = new JSONParser();
	obj =(JSONObject)(parser.parse(new FileReader(file)));
	details = (JSONObject)(obj.get("person"));
	fw = new FileWriter(file);
		
	}
	
	
	public void createFile() throws IOException {
		
		if(!file.exists())
			file.createNewFile();		
	}
	
	
	public void readData() throws IOException, ParseException, org.json.simple.parser.ParseException {
		
//       BufferedReader br = new BufferedReader(new FileReader(file));		
//		String str ;
//		while((str = br.readLine())!=null)
//			System.out.println(str);
		
		System.out.println(details);
		
		JSONArray arr = (JSONArray) details.get("kids");
		System.out.println(arr);
		
		JSONArray hobby = (JSONArray) details.get("hobbies");
		for(Object a:hobby)
			System.out.println(a);
		
		
	} 
	
	
	public void appendData() throws FileNotFoundException, IOException, ParseException {
		
			
		// add object in json object
		
		details.put("ID", "1");
		details.put("Date_Of_Birth", "1989-09-26");
		details.put("Place_Of_Birth", "Vishakhapatnam");
		details.put("Country", "25000");
		System.out.println(details);
		
		// add object into json array
		JSONArray addKids = (JSONArray)(((JSONObject) obj.get("person")).get("kids"));
		JSONObject kid = new JSONObject();
		kid.put("name","nancy" );
		kid.put("age", 10);
		addKids.add(kid);
		System.out.println(addKids);
		
		System.out.println(details);
		
	}
	
	public void removeObject() throws IOException {
		details.remove("name");
		details.remove("age");
		System.out.println(details);
		
		fw.write(details.toJSONString());
		fw.flush();
		
		
	}
	
	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
	
		JsonFile pf = new JsonFile();
		pf.createFile();
		pf.readData();		
		pf.appendData();
		pf.removeObject();
		
		
		
	}

}

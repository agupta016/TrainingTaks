package com.assignment.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFile {
	
	File file;
	FileWriter fw;
	JSONParser parser;
	JSONObject obj;
	JSONObject jsonfile;
	
	JsonFile() throws FileNotFoundException, IOException, ParseException{
		
	file = new File("SampleFiles/file.json");
	parser = new JSONParser();
	obj =(JSONObject)(parser.parse(new FileReader(file)));
	jsonfile = (JSONObject)(obj.get("person"));
	fw = new FileWriter(file);
		
	}
	
	
	public void createFile() throws IOException {
		
		if(!file.exists())
			file.createNewFile();		
	}
	
	
	public void readData() throws IOException, ParseException, org.json.simple.parser.ParseException {
		
		
		System.out.println(jsonfile);
		
		JSONArray arr = (JSONArray) jsonfile.get("kids");
		System.out.println(arr);
		
		JSONArray hobby = (JSONArray) jsonfile.get("hobbies");
		for(Object a:hobby)
			System.out.println(a);
		
		
	} 
	
	
	public void appendData() throws FileNotFoundException, IOException, ParseException {
		
			
		// add object in json object
		jsonfile.put("name", "tinny George");
		jsonfile.put("ID", "1");
		jsonfile.put("Date_Of_Birth", "1989-09-26");
		jsonfile.put("Country", "25000");
		System.out.println(jsonfile);
		
		// add object into json array
		JSONArray addKids = (JSONArray)(((JSONObject) obj.get("person")).get("kids"));
		JSONObject kid = new JSONObject();
		kid.put("name","nancy" );
		kid.put("age", 10);
		addKids.add(kid);
		System.out.println(addKids);
		
		System.out.println(jsonfile);
		
	}
	
	public void removeObject() throws IOException {
		jsonfile.remove("name");
		jsonfile.remove("age");
		System.out.println(jsonfile);		
		
	}
	
	public void writeData() throws IOException {
		
		JSONObject ob = new JSONObject();
		ob.put("person",jsonfile);
		fw.write(ob.toJSONString());
		fw.flush();
		
		
	}
	
	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
	
		JsonFile pf = new JsonFile();
		pf.createFile();
		pf.readData();		
		pf.appendData();
		pf.removeObject();
		pf.writeData();
		
		
		
	}

}

package com.qait.demo;

import org.json.JSONTokener;
import org.json.simple.JSONObject;
import net.minidev.json.JSONArray;

public class JsonArraydemo {
	
	public static void main(String[] args) {
		
		JSONObject object1 = new JSONObject();
		object1.put("ID", "1");
	    object1.put("First_Name", "Krishna Kasyap");
	    object1.put("Last_Name", "Bhagavatula");
	    object1.put("Date_Of_Birth", "1989-09-26");
	    object1.put("Place_Of_Birth", "Vishakhapatnam");
	    object1.put("Country", "25000");
	    
	    JSONObject obj1 = new JSONObject();
	    obj1.put("hello", object1);
	    
	    JSONObject object2 = new JSONObject();
		object2.put("aabcc",3);
	    object2.put("ccccc",3);
	    object2.put("qqqq","yff");
	  
		
		JSONArray array = new JSONArray();
		  array.add(obj1);
	      array.add(object2);
//	      array.add("city: Hyderabad");
//	      array.add("Area: Madapur");
//	      array.add("State: Telangana");
	      
	     System.out.println(array);
	     
	     JSONObject object = new JSONObject();
	     object.put("detials", array);
	     System.out.println(object);
	      
	
}
}

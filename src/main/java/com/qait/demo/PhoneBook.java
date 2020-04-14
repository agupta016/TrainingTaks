package com.qait.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Iterators;

public class PhoneBook {
	
	HashMap<String,Integer> person = new HashMap<String, Integer>();
	Iterator hmIterator  = person.entrySet().iterator();
	 void set() {
		
		
		person.put("ayushi", 1234578);
		person.put("gupta", 1234578);
		person.put("abc", 1234578);
		person.put("xyz", 1234578);
		person.put("asdfgh", 1234578);
		
	}
	void get(String name) {
		boolean flag=false;		
		while(hmIterator.hasNext())
		{
			Map.Entry element = (Entry) hmIterator.next();
			if(element.getKey()==name)
			{
				flag =true;
			  System.out.println(element.getKey() +"--"+element.getValue());
			}
			
		}
		if(flag==false)
			System.out.println("Person not registered in PhoneBook");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook pb = new PhoneBook();
		pb.set();
		pb.get("ayushim");

	}

}

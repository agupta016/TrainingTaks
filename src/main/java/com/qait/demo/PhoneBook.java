package com.qait.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneBook {
	
	HashMap<String,Integer> person = new HashMap<String, Integer>();
	
	Scanner sr = new Scanner(System.in);
	 void set() {
		
		System.out.println("enter no. of users");
		int n = sr.nextInt();
		for(int i =0;i<n;i++)
		{
			System.out.println("enter user name and phone no.");
			String name = sr.next();
			int phone_no=sr.nextInt();
			person.put(name, phone_no);
			
		}
		
	}
	void get() {
		
		String name;
		System.out.println("user name you want to search");
		name = sr.next();
		boolean flag=false;		
		Iterator hmIterator  = person.entrySet().iterator();
		while(hmIterator.hasNext())
		{
			Map.Entry element = (Entry) hmIterator.next();
			if(((String) element.getKey()).equalsIgnoreCase(name))
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
		pb.get();

	}

}

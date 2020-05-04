package com.assignment.collectionDemo;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
	
    ArrayList<String> list=new ArrayList<String>();
    list.add("Code");
    list.add("ArrayList");
    list.add("Java");
    System.out.println(list);
    list.remove(1); 
    System.out.println("after Clearing:" +list);
    list.clear();
    System.out.println("after Clearing:" +list);
	}

}

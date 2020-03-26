package com.qait.test;

import java.util.ArrayList;
import java.util.Collections;


public class SortUseOfCompartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Author> al = new ArrayList<Author>();
		al.add(new Author("Henry", "Tropic of Cancer",  45));
		al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
		al.add(new Author("Frank", "300", 65));
		al.add(new Author("Deborah", "Sky Boys", 51));
		al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));

		Collections.sort(al);
	     for(Author au: al){       
	       System.out.println(au.author_name);        
	     } 
	     
	    	
	
}

	
}




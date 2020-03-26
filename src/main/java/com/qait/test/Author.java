package com.qait.test;

public class Author implements Comparable<Author> {

	String author_name;
	String book_name;
	int author_age;
	
	Author(String name, String book, int age) {
		this.author_name = name;
		this.book_name = book;
		this.author_age = age;		
	}
	 public String getFirstName() { 
		    return author_name; 
		  }
		
		  public String getBookName() { 
		    return book_name; 
		  }
		 
		  public int getAuAge() { 
		    return author_age; 
		  }
		public int compareTo(Author au) {
			// TODO Auto-generated method stub
			return this.author_name.compareTo(au.author_name);
		}
		  
		  
}

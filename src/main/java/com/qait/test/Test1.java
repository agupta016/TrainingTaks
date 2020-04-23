package com.qait.test;

import java.io.File;

public class Test1  {
	
	
		 public static void main(String a[]){
		        File file = new File("src/main/java/com/qait/test/Author.java");
		            
		        System.out.println(file.toURI());
		        System.out.println(file.lastModified());
		       
		       }
	 	    
	  }





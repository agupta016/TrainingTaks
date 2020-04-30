package com.qait.assignment.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class YamlFile {
	File file = new File("SampleFiles/file.properties");
	
	public void createFile() throws IOException {
		
		if(!file.exists())
			file.createNewFile();		
	}
	
	public void readData() throws IOException {
		
       BufferedReader br = new BufferedReader(new FileReader(file));		
		String str ;
		while((str = br.readLine())!=null)
			System.out.println(str);
		
	} 
	public void updateData() {
		
	}
	
	public void removeData() {
		
	}
	
	public void appendData() {
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		PropertyFile pf = new PropertyFile();
		pf.createFile();
		pf.readData();
		pf.updateData();
		pf.removeData();
		pf.appendData();
		
		
		
	}

}

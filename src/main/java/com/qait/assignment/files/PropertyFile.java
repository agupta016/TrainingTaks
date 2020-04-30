package com.qait.assignment.files;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyFile {
	
	File file = new File("SampleFiles/file.properties");
	BufferedWriter writer ;
	BufferedReader reader;
	Properties prop = new Properties();
	FileOutputStream out ;
	
	public void createFile() throws IOException {
		
		if(!file.exists())
			file.createNewFile();		
	}
	
	public void readData() throws IOException {
		
//		reader = new BufferedReader(new FileReader(file));		
//		String str ;
//		while((str = reader.readLine())!=null)
//			System.out.println(str);
//		
//		reader.close();
		
		
		prop.load(new FileInputStream(file));
		String appVersion = prop.getProperty("version");
		System.out.println(appVersion);
		assertEquals("1.0", appVersion);
		
	} 	
 
	public void readKeys() throws FileNotFoundException, IOException {
		
		prop.load(new FileInputStream(file));
		Enumeration e = prop.propertyNames();
        while(e.hasMoreElements()){
            String key = (String)e.nextElement();
            System.out.println(key+"="+prop.getProperty(key));
        }
	}
	public void updateData() throws FileNotFoundException, IOException {
		
		prop.load(new FileInputStream(file));
		prop.setProperty("hello", "valuejhvsffd");
		FileOutputStream out = new FileOutputStream(file);
		prop.store(out,null);
		out.close();
		System.out.println("Data successfully updated at the end of file");
	}
	
	public void removeData() throws FileNotFoundException, IOException {
		prop.load(new FileInputStream(file));
		prop.remove("application");
		out = new FileOutputStream(file);
		prop.store(out,null);
		out.close();		
	}
	
	public void appendData() throws IOException {

		
//		writer = new BufferedWriter(new FileWriter(file,true));
//		String line = sr.nextLine();
//		writer.write(line);
//		writer.newLine();
//		writer.close();
		prop.load(new FileInputStream(file));
		prop.setProperty("application", "example");
		out = new FileOutputStream(file);
		prop.store(out,null);
		out.close();
		System.out.println("Data successfully appended at the end of file");		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		PropertyFile pf = new PropertyFile();
		pf.createFile();
		pf.readData();
		pf.readKeys();
		pf.updateData();
		pf.removeData();
		pf.appendData();
		
		
		
	}
	

}

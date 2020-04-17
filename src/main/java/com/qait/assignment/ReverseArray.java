package com.qait.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

//For example, if the input array is {12, 56, 34, 79, 26}, the reversal is {26, 79, 34, 56, 12}. 
//You MUST NOT use another array in your method (but you need a temporary variable to do the swap).
//Take input from in.txt file to create dynamic array.


public class ReverseArray {
	
	File file;
	BufferedReader br;
	PrintStream ps;
	int numArray[];
	static int lines=0;
	
	public void writeFile() {
		try {
			//create File
			file = new File("AssignmentFiles/in.txt");
			//create a buffered reader that connects to the console, we use it so we can read lines
			br = new BufferedReader(new InputStreamReader(System.in));
			ps = new PrintStream(file);
			System.out.println("enter number array for reverse, \"exit\" for stop");
			while(true){			
		
			      String input = br.readLine();
			      if(input.equalsIgnoreCase("exit"))
			    	  break;
			      ps.println(input);
			      lines++;
			}
			System.out.println("File write sucessfully");
			ps.close();
			br.close();
			
		}catch(Exception e) {}
	}
	
	public int[] readArray() throws NumberFormatException, IOException {
		int i=0;
		br = new BufferedReader(new FileReader(file));
		numArray = new int[lines];
		while(i<lines){
			numArray[i] = Integer.parseInt(br.readLine());
			i++;
		}
		br.close();
		return numArray;
	}
	
	public static void reverseArray(int[] numArray) {
		int i=0,j=numArray.length-1;
		int n;
		// logic for reverse array without use another array
		while(i<numArray.length/2)		{			
			n=numArray[i];
			numArray[i]=numArray[j];
			numArray[j]=n;
			j--;
			i++;
		}
		
		i=0;
		// print array
		while(i<numArray.length)
		{			
			System.out.println(numArray[i]);
			i++;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ReverseArray ra =new ReverseArray();
		ra.writeFile();
		int array[] = ra.readArray();
		ra.reverseArray(array);

	}

}

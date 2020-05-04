package com.assignment.arrays;

//Write a String reverse program that takes array of String as input from the command-line arguments and 
//reverse the String at each index.

public class StringReverse {

	public static void main(String[] strArray) {
		
	
		int n = strArray.length;
		
    	for(int i =0;i<n;i++)
		{
		//Reverse string using inbuilt method
//			StringBuilder sb = new StringBuilder(strArray[i]);
//			strArray[i] = sb.reverse().toString();
			
	// Another way to reverse string
			String str = strArray[i];
			String revStr="";
			
			for(int j =n-1;j>=0;j--)
			{
				revStr = revStr+ str.charAt(j);
			}
			strArray[i] = revStr;
			System.out.println(strArray[i]);
		   
		}		

	}

}

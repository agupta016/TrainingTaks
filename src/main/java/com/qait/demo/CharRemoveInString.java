package com.qait.demo;

import java.util.Arrays;

public class CharRemoveInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HFvavahvHVsubahjasgadtrey";
		char ch = 'V';		
		charRemove(str,ch);
	}
	
	public static void charRemove(String str,char ch) {
		int n  = str.length();
		boolean flag = false;
		int i=0,j=0;
		char str1[] = new char[n],str2[]=new char[n];
		for(i =0 ;i<n;i++) {
			str1[i] = str.charAt(i);
		}
		System.out.println(str1);
		for(i=0;i<n;i++) {
			
			if(str1[i] == ch) {				
				flag = true;					
				}	
			else {
				str2[j] = str1[i];
			    j++;
			   }
		}
		
		str = Arrays.toString(str2);
		if(flag)
			System.out.println("Char removed");
		else
			System.out.println("Try with another character");
		System.out.println(str2);	
		
	}

}

package com.assigments.tasks.demo;


public class StringPalindromeDemo3  {
	
	public static void longestPalindrome(String s){
		int start =0,end = s.length();
		int len=0,n;
		
		for(int i=1;i<s.length()-1;i++){
			String str1 = s.substring(start,i);
			String str2 = s.substring(i, end);
			int length1 = findPalindrome(str1);
			int length2=findPalindrome(str2);
			if(length1>length2)
				n=length1;
			else
				n=length2;
			
			if(n>len){
				len=n;
			}
		}
			System.out.println(len);
		
	}
	
	public static int findPalindrome(String str){
		
		int end = str.length();
		int len=0,n=0;
		for(int i=0;i<str.length()-1;i++){
			String s1 = str.substring(i,end);
			
		    StringBuilder sb = new StringBuilder(s1);
		    String compareStr = sb.reverse().toString();
		   if(str.equals(compareStr)){
			   n= s1.length();
			   if(n>len){
				   len=n;
				   
			   }
		    }
		}
		return len;
		
		
	}
	
	public static void main(String[] args) {
	
		longestPalindrome("asdfdsaqwertyuytrewqvbvbcbvbv");
		
		
	}  
}

package com.assigments.tasks.demo;


public class StringAnagram {

	public static void demo(String s1, String s2) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		int len1,len2;
		str1.append(s1.toLowerCase());
		str2.append(s2.toLowerCase());
		len1 = str1.length();
		len2 = str2.length();
		boolean flag = false;
		if(len1==len2)
		{
			for(int i=0;i<len1;i++) {
				for(int j =0;j<len2;j++)
				{
					if(str1.charAt(i)==str2.charAt(j)) {
						
						str2.deleteCharAt(j);
						len2 = str2.length();
						flag = true;
					}
					else {
						flag =false;
						break;
					}
						
				}
			}
			if(flag==true)
				System.out.println("strings are anagram");
			else
				System.out.println("String are not anagram");
		}
		else 
			System.out.println("String are not anagram");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo("heLlo","HELLO");
	}

}

package com.qait.assignment;

//Write a SumDigits program to sum up the individual digits of a positive integer, given in the command line. 

public class SumDigits {

	public static void main(String[] num) {
		
		System.out.println(num[0]);
		int sum=0;
		int len = num[0].length();
		for(int i=0;i<len;i++)
		{
			int n = Integer.parseInt(String.valueOf(num[0].charAt(i)));
			sum = sum+n;
		}
		System.out.println(sum);

	}

}

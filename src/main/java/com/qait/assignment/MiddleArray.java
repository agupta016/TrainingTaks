package com.qait.assignment;

import java.util.Scanner;

//Take an input of number array where length of the array is even and is more than two. 
//Write a method which returns an array of middle two numbers.

public class MiddleArray {

	int arr[];
	int len;
	
	public void makeMiddle() {
		
		int n = arr.length/2;
		
		System.out.println("{" +arr[n-1] + "," +arr[n] + "}");
	
	}
	
	public void getArray() {
		
		Scanner sr = new Scanner(System.in);		
		System.out.println("enter length of array,it must be even and more than 2");
		len = sr.nextInt();
		arr = new int[len];
		int num;
		
		if(len>2 && (len%2==0)) {
			
			System.out.println("enter elements of array");
			
			for(int i =0;i<len;i++)
			{
				num = sr.nextInt();				
				arr[i] = num;						
			}
				sr.close();
		}
		else
		{
			System.out.println("Invalid lenght. Try again");
			getArray();
		}
		
	}
	
	public static void main(String[] args) {
		
		MiddleArray ma = new MiddleArray();
		ma.getArray();
		ma.makeMiddle();
				
	}
}

package com.qait.demo;

public class ArrayMatrixDemo {
	
	public static void fun(){
		
		int arr[][]= {{1,2,3,},{4,5,6},{7,8,9},{10,11,12}};
		int j=0;
		
		for(int i =0,k=1;i<arr.length;i++,k++)
		{
	
			while(j<arr[i].length && j>=0)
			{
				System.out.print(arr[i][j]+" ");
				if(k%2==0)
					j--;
				else
					j++;
			}		
			if(k%2==0)
				j++;
			else
				j--;
			
		}		
		
	}

	public  static void main(String[] args) {
	
			fun();
			
		
	}

}

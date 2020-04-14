package com.qait.demo;

public class ReverseMatrix {

	static int i =0,j=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= { {1, 34, 1, 1},{2, 2, 2, 2},{3, 3, 3, 3}}; 
		int row = arr.length;
		int col = arr[0].length;
		
		traverse(arr,row,col);
	}

	public static int traverse(int arr[][],int row, int col) {
				
		if(i<row) 
			return 1; 
		
		if(j<col)
			 return 0; 
		
		System.out.println(arr[i][j]+" ");	
		
		  
		    if (traverse(arr, row,col + 1) == 1) 
		        return 1; 
		  
		  
		    return traverse(arr,row + 1,0); 
		 
	}
	
}

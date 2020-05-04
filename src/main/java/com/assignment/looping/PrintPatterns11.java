package com.assignment.looping;

//1                           1      
//1 2                       2 1      
//1 2 3                   3 2 1      
//1 2 3 4               4 3 2 1      
//1 2 3 4 5           5 4 3 2 1      
//1 2 3 4 5 6       6 5 4 3 2 1      
//1 2 3 4 5 6 7   7 6 5 4 3 2 1      
//1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 

public class PrintPatterns11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n=8;
		
		for(int i =1;i<=n;i++)
		{
			int k=1;
			for(int j =1 ;j<=n;j++)
			{
				if(j<=i) {
					
					System.out.print(k+" ");
					k++;
				}
				else
					System.out.print("  ");
				
			}
			k--;
			if(i==n)
				k--;
			
			for(int j =1 ;j<n;j++)
			{
				if(j>=n-i) {
					System.out.print(k+" ");
					k--;
					
				}
				else {
						System.out.print("  ");			

				}
				
			}
			System.out.println();
		}
		
		
	}

}

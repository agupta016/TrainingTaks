package com.assignment.looping;

public class PrintPatterns9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n=8;
		
		for(int i =0;i<n;i++)
		{
			int k = 8-i;
			for(int j = 1 ;j<=n;j++)
			{
				if(j<=i)
					System.out.print("  ");
				else
				{
					System.out.print(k+" ");					
			     	k--;
				}
			}
			System.out.println();
		}

	}

}

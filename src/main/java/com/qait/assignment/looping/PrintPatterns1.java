package com.qait.assignment.looping;

import java.util.Scanner;

//0                            
//1 0                          
//0 1 0                        
//1 0 1 0                      
//0 1 0 1 0                    
//1 0 1 0 1 0                  
//0 1 0 1 0 1 0                
//1 0 1 0 1 0 1 0

public class PrintPatterns1 {

	public static void main(String[] args) {
		
		int n = 8;
		
		for(int i =1 ;i<=n;i++)
		{
		  for(int j=1;j<=i;j++)
			{
				if(i%2 == 0) {
					 if(j%2==0)
					    System.out.print("0");
					 else
						 System.out.print("1");
				}					
				else
				{
					 if(j%2==0)
						    System.out.print("1");
						 else
							 System.out.print("0");
				}
					

				
			}
			
			System.out.println();
			
		}
		
		

	}

}

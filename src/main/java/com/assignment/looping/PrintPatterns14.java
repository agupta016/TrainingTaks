package com.assignment.looping;

//1                                    
//1  1                              
//1  2  1                         
//1  3  3  1                   
//1  4  6  4  1                
//1  5 10 10  5  1            
//1  6 15 20 15  6  1 

public class PrintPatterns14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  n = 7 ;
		
		for(int i =0 ;i<n;i++) {
			
			for(int j =0 ;j<=i;j++) {
				 System.out.print(binomialCoeff(i, j)+" "); 
				
			}         		
			System.out.println();
		}
		
	}

	 static int binomialCoeff(int n, int k) 
	    { 
	        int res = 1; 
	          
	        if (k > n - k) 
	        k = n - k; 
	              
	        for (int i = 0; i < k; ++i) 
	        { 
	            res *= (n - i); 
	            res /= (i + 1); 
	        } 
	        return res; 
	    }

}

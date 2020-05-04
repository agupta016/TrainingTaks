package com.assignment.arrays;

//Similar to Math class, write a Matrix library that supports matrix operations (such as addition, subtraction, 
//multiplication) via 2D arrays. The operations shall support both doubles and int. Also write a test class to exercise
//all the operations programmed.



public class Matrix {
	
	public static void printMatrix(int[][] m)
	{
		for(int i[]:m)
		{
			for(int j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void printMatrix(double[][] m)
	{
		for(double i[]:m)
		{
			for(double j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	 public static boolean haveSameDimension(int[][] m1, int[][] m2) {
		 if(m1.length == m2.length)
		 {
		 if(m1[0].length == m2[0].length)
			 return true;
		 else 
			 return false;	
		 }
		 else
			 return false;
	 }
	 
	   public static boolean haveSameDimension(double[][] m1, double[][] m2) {
		   if(m1.length == m2.length)
			 {
			 if(m1[0].length == m2[0].length)
				 return true;
			 else 
				 return false;	
			 }
		   else
				 return false;
		   
	   }

	   public static int[][] add(int[][] m1, int[][] m2) {
		   int m[][]= new int[m1.length][m2.length];
		  if(haveSameDimension(m1, m2)) {
			  
			   for(int i =0;i<m.length;i++)
			   {
				   for(int j=0;j<m.length;j++)
					   m[i][j] = m1[i][j] +m2[i][j];
			   }
		       
		   }
		       return m;  
		   
	   }
	   public static double[][] add(double[][] m1, double[][] m2) {
		  
		   double m[][]= new double[m1.length][m2.length];
			  if(haveSameDimension(m1, m2)) {
				  
				   for(int i =0;i<m.length;i++)
				   {
					   for(int j=0;j<m.length;j++)
						   m[i][j] = m1[i][j] +m2[i][j];
				   }
			       
			   }
			       return m;  
	
		   
		}
	
	   public static boolean haveAllowedDimension(int[][] m1, int[][] m2)
	    {
	       
	        return m1[0].length == m2.length;
	    }
	   
	   public static boolean haveAllowedDimension(double[][] m1, double[][] m2)
	    {
	       
	        return m1[0].length == m2.length;
	    }
	    
	   public static int[][] multiply(int[][] m1, int[][] m2)
	    {
		   int[][] c = new int[m1.length][m2[0].length];
		   if(haveAllowedDimension(m1,m2)) {	        
	        for (int i = 0; i < c.length; i++) {
	            for (int j = 0; j < c[i].length; j++) {
	                c[i][j] = 0;
	                for (int k = 0; k < m1[0].length; k++) {
	                    c[i][j] += m1[i][k] * m2[k][j];
	                }
	            }
	        }
	      }
		return c;
		   
	    }
	   
	   public static double[][] multiply(double[][] m1, double[][] m2)
	    {
	        double[][] c = new double[m1.length][m2[0].length];
	        if(haveAllowedDimension(m1,m2)) {
	        for (int i = 0; i < c.length; i++) {
	            for (int j = 0; j < c[i].length; j++) {
	                c[i][j] = 0;
	                for (int k = 0; k < m1[0].length; k++) {
	                    c[i][j] += m1[i][k] * m2[k][j];
	                }
	            }
	        }}
	        return c;                
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = {{1,2,3},{5,6,7},{4,8,7}};
		int n[][] = {{11,12,13},{15,16,17},{14,16,3}};
		double m1[][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
		double n1[][] = {{11,12,13,14},{15,16,17,18},{11,12,13,14},{15,16,17,18}};
		
		// operation on int matrix
		
		int mn[][]=add(m,n);
		printMatrix(mn);
		mn = multiply(m, n);
		printMatrix(mn);
				
		//operation on double matrix
		double mn1[][] = add(m1,n1);
		printMatrix(mn1);
		mn1 = multiply(m1,n1);
		printMatrix(mn1);
		
		
	}

}

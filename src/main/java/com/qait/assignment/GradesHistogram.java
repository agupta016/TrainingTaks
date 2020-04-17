package com.qait.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Write a program called GradesHistogram, which reads in n grades (of int between 0 and 100, inclusive) 
//from a text file called grades.in and displays the histogram horizontally and vertically. 



public class GradesHistogram {

	 // int array of grades
	 public static int[] grades;
	 public static int numStudents;
	 //int array for histogram bins like , 0-9, 10-19..90-100
	 public static int[] bins = new int[10];	 
	    
	
	   private static void readGrades(String filename) throws IOException {
			// TODO Auto-generated method stub
		   File file= new File(filename);
		   BufferedReader br = new BufferedReader(new FileReader(file));
		   String line=null;
		   
		   // total no. of students 
		   numStudents = Integer.parseInt(br.readLine());
		   
      // store grades into int grades
		   line = br.readLine();
		   String arr[] = line.split("\\s+");
		   grades = new int[numStudents];
		   for (int i=0 ; i<arr.length ; i++) {
			    grades[i] = Integer.parseInt(arr[i]);
			    		System.out.print(grades[i]+" ");;
		
               }
		   br.close();
		}

	   private static boolean checkGrades() {
		   boolean flag =false;
		   for(int num : grades) {
			   if(num>=0 && num <=100)
			   {
				   flag = true;
				   continue;				   
			   }
			   else
			   {
				   System.out.println("Student grades must be equal or between 0-100, please modify grades and try again..");
				   flag =false;
				   break;
			   }
		   }
		   return flag;
		   
	   }
	   
		private static void computeHistogram() {
						
			for(int num : grades)
			{
				if(num >=0 && num <=9)
					bins[0] += 1;
				if(num >=10 && num <=19)
					bins[1] += 1;
				if(num >=20 && num <=29)
					bins[2] += 1;
				if(num >=30 && num <=39)
					bins[3] += 1;				
				if(num >=40 && num <=49)
					bins[4] += 1;
				if(num >=50 && num <=59)
					bins[5] += 1;
				if(num >=60 && num <=69)
					bins[6] += 1;
				if(num >=70 && num <=79)
					bins[7] += 1;
				if(num >=80 && num <=89)
					bins[8] += 1;
				if(num >=90 && num <=100)
					bins[9] += 1;
								
			}
			System.out.println();
			for(int n :bins)
				System.out.print(n +" ");
						
		}
		
		// Print histogram based on the "bins" array.
	    private static void printHistogramHorizontal() {
		
	    	int start = 0,end=9;
	    	int j=0;
	    	System.out.println();
	    	for(int n:bins)
	    	{ 
	    		int i=0;
	    		System.out.print(start +" - "+ end +" : ");
	    		while(i< bins[j]) {
	    			System.out.print("* ");
	    			i++;
	    		}
	    		System.out.println();
	    		j++;
	    		start +=10;
	    		end +=10;
	    	}
		
	    }
	
	     // Print histogram based on the "bins" array.
	    private static void printHistogramVertical() {
	    	int start = 0,end=9;
	    	int max=bins[0];
	    	
	    	for(int i=1;i<bins.length;i++)
	    	{
	    		if(max < bins[i])
	    			max = bins[i];
	    		
	    	}
	    	for(int i=max;i>0;i--)
	    	{
	    		for(int j=0;j<bins.length;j++)
	    		{	    			
	    			if(bins[j]>=i)
	    				System.out.print(" *     ");
	    			else
	    				System.out.print("       ");
	    			
	    		}
	    		System.out.println();
	    	}
	    	
	    		    	
	    	for(int n:bins)
	    	{ 
	    		
	    		System.out.print(start +"-"+ end +"  ");
	    		start +=10;
	    		end +=10;
	    	}
		
	    	
		
	     }
	
	public static void main(String[] args) throws IOException {
		

		readGrades("AssignmentFiles/Grades.txt");
		boolean flag = checkGrades();
		if(flag==true)
		{
			computeHistogram();
			printHistogramHorizontal();
			printHistogramVertical();
		}
	 }

	

}

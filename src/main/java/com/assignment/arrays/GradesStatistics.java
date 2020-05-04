package com.assignment.arrays;

//Write a GradesStatistics program, which reads in n grades (of int between 0 and 100, inclusive) and displays
//the average, minimum, maximum, and standard deviation. Your program shall check for the valid input. 
//You should keep the grades in an int[] and use a method for each of the computations. 

import java.io.IOException;
import java.util.Scanner;

public class GradesStatistics {

   
	int numStudents=0;
	int grades[];
	Scanner sr = new Scanner(System.in);
	int min=0,max=0;
	double avg=0,stdDev=0;
	
	public void readGrade() {

		System.out.println("Enter the number of students:");
		numStudents = sr.nextInt();
		grades = new int[numStudents];
		for(int i=0;i<numStudents;i++)
		{
			System.out.println("Enter the grade for student-->" +(i+1));
			grades[i] = sr.nextInt();
			if(!(grades[i]>=0 && grades[i]<=100))
			{
				System.out.println("Invalid! student marks must between 0 to 100");
				System.out.println("Enter the grade for student -->" +(i+1));
				grades[i] = sr.nextInt();
				if(!(grades[i]>=0 && grades[i]<=100))
						continue;
			}
		}			
}
		
	public void MinMaxGrade() {
		
		 min=grades[0];
		 max=grades[0];
		for(int i=0;i<grades.length;i++)
		{
			if(min > grades[i]) 
				min = grades[i];
			if(max < grades[i])
				max=grades[i];
		}
		System.out.println("The minimum is " +min);
		System.out.println("The maximum is "+max);
	}
	
	public void avg() {
		int i =0;
		int sum=0;
		for(i=0;i<grades.length;i++)
			sum=sum+grades[i];
		avg = (double)sum/grades.length;
		System.out.println("Avergae is "+avg);
	}
	public void standDiv() {
		for(double num: grades) {
            stdDev += Math.pow(num - avg, 2);
        }
		System.out.println(stdDev);
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		GradesStatistics ga = new GradesStatistics();
		ga.readGrade();
		ga.MinMaxGrade();
		ga.avg();
		ga.standDiv();

	}


}

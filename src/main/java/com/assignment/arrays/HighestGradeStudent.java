package com.assignment.arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Read student name and their grade from the text file and also find the highest grade of student and
//print the highest grade along with the student name and sort  array according grade.

public class HighestGradeStudent {

	static String studentNames[]= {};
	static int grades[]= {};
	static int numStudents;
	
	void readGrades() throws NumberFormatException, IOException {
		File file= new File("AssignmentFiles/studentDetails.txt");
		   BufferedReader br = new BufferedReader(new FileReader(file));
		   String line=null;
		   int n=0;
		   
		   // count no. of students
		   while(br.readLine()!=null)
			   numStudents++;
		   
		   br = new BufferedReader(new FileReader(file));
		   grades = new int[numStudents];
		   studentNames = new String[numStudents];
		   
         // store grades and names into   grades and name var
		  while((line = br.readLine()) != null) {
		   String[] arr = line.split(",");
		   
		   for (int i=0 ; i<arr.length ; i++) {
			   arr[i] = arr[i].replaceAll("[^a-zA-Z0-9\\\\s+]", "");
			   
		   }
		   studentNames[n] = arr[0];
		   grades[n] = Integer.parseInt(arr[1]);
		   n++;
	   }
		   br.close();
	}
	
	void sortGrade() {
		int max;
		String name;
		for(int i = 1;i< numStudents;i++)
		{
			for(int j =0;j<numStudents-i;j++)
			{
				if(grades[j] < grades[j+1]) {
					max = grades[j+1];
				    grades[j+1] = grades[j];
				    grades[j] = max;
				    
				    name = studentNames[j+1];
				    studentNames[j+1] =studentNames[j];
				    studentNames[j] = name;
				    
				}
			}
		}
		System.out.println("Student name is with highest marks : "+studentNames[0] +" --> "+grades[0]);
		System.out.println("list of sorted student with grades");
		for(int i =0;i<numStudents;i++)
			System.out.println(studentNames[i] +" --> "+grades[i]);
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		HighestGradeStudent hg = new HighestGradeStudent();
		hg.readGrades();
		hg.sortGrade();

	}

}

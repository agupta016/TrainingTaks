package com.qait.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GradesAverage {

	File file = new File("AssignmentFiles/studentsfile.txt");
   
	int numStudents=0;
	int grades[];
	Scanner sr = new Scanner(System.in);
	
	
	public void enterStudentGrade() {
//		System.out.println("Enter no. of students. if wnat to exit trype \"exit\"");
//		
//		while((sr.nextLine()).equalsIgnoreCase("exit"))
//		{
//			System.out.println(sr.next());
//			
//		}	
//		System.out.println("exited");
		
	}
	
	public void readNumStudents() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		numStudents = Integer.parseInt(br.readLine());
		grades= new int[numStudents];

		int i=0;
		while(i<numStudents) {
			grades[i]=Integer.parseInt(br.readLine());
			i++;
		}
	
		br.close();
		System.out.println(grades);
	}
	
	
	public void checkGrades() {
		
		int i=0;
		while(i<grades.length)
		{
			System.out.println(grades[i]);
			if(!(grades[i]>=0 && grades[i]<=100))
			{
				System.out.println("student marks must between 0 to 100");
				System.out.println("Want to modify grades if yes enter \"y\" otherwise press any key");
				String res = sr.next(); 
				if(res.equalsIgnoreCase("y"))
				{
					System.out.println("Enter new marks for student --> " + (i+1));
					grades[i] = sr.nextInt();
					if(!(grades[i]>=0 && grades[i]<=100))
						continue;
					System.out.println(grades[i]);
				}
			}	
			i++;
			
		}
	}
	
	public void avgGrade() {
		int i =0;
		int sum=0;
		int avg =0;
		for(i=0;i<grades.length;i++)
			sum=sum+grades[i];
		avg = sum/grades.length;
		System.out.println(sum+"--"+avg);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		GradesAverage ga = new GradesAverage();
		ga.enterStudentGrade();
		ga.readNumStudents();
		ga.checkGrades();
		ga.avgGrade();

	}

}

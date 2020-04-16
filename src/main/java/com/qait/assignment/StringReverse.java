package com.qait.assignment;

public class StringReverse {


	public static void main(String[] strArray) {
		// TODO Auto-generated method stub
	
//		Scanner sr = new Scanner(System.in);
//		System.out.println("Enter total no. of string want to reverse");
		int n = strArray.length;
		
    	for(int i =0;i<strArray.length;i++)
		{
		//Reverse string using inbuilt method
//			StringBuilder sb = new StringBuilder(strArray[i]);
//			strArray[i] = sb.reverse().toString();
			
	// Another way to reverse string
			String str = strArray[i];
			String revStr="";
			
			for(int j =str.length()-1;j>=0;j--)
			{
				revStr = revStr+ str.charAt(j);
			}
			strArray[i] = revStr;
			System.out.println(strArray[i]);
		   
		}		

	}

}

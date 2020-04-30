package com.qait.assignment.arrays;

import java.util.Scanner;

public class Hex2Decimal {

	public void convertDecimal(String hexa, String []hexBits) {
		int i;
		String decimal="";
		for(i=0;i<hexa.length();i++)
		{
			int k=0;
			switch(hexa.charAt(i))
			{
			   case 'a' :
			     	k=10;
			     	break;
			   case 'b' :
			     	k=11;
			     	break;
			   case 'c' :
			     	k=12;
			     	break;
			   case 'd' :
			     	k=13;
			     	break;
			   case 'e' :
			     	k=14;
			     	break;
			   case 'f' :
			     	k=15;
			     	break;
			     	
			     default :
			    	 k = Integer.parseInt(String.valueOf(hexa.charAt(i)));
			
			}
     		
			decimal = decimal + hexBits[k];

		}
		System.out.println(decimal);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hex2Decimal hd = new Hex2Decimal();
		System.out.println("enter hexa value to convert into decimal");
		Scanner sr= new Scanner(System.in);
		String hexa = sr.next();
		sr.close();
		String [] hexBits = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
		
		hd.convertDecimal(hexa,hexBits);
		

	}

}

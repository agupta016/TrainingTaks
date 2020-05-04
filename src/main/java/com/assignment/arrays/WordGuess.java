package com.assignment.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordGuess {
	
	Scanner sr = new Scanner(System.in);
	
	public void gameStart(String word) {		
		
		int n = word.length();
		String guess[] = new String[n];
		
		for(int i=0;i<n;i++) {
			guess[i]= "_";
		}
		
		for(int k=1;k<=5;k++)
		{
		
	     	System.out.println("Key in one character or your guess word");
		    String str = sr.next();
		    
		    if(str.equalsIgnoreCase(word))
		    {
		    	System.out.println("Congratulations !.. you won");
		    	break;
		    }
		    
		    else 
		    	if(word.contains(str)){
		    	   for(int i=0;i<word.length();i++)
		           {
		    	     if(String.valueOf(word.charAt(i)).equals(str))
		     	     {
		    		    guess[i] = String.valueOf(word.charAt(i));			    
	                }
         	    	    System.out.print(guess[i]);	    		
	              }
		        }
		        else
		        	System.out.println("Wrong character, you have left "+(5-k)+" more chances");
		    	
		    System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WordGuess wg = new WordGuess();
		String word = args[0];
		wg.gameStart(word);
	}

}

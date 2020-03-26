package com.qait.test;

public class Test1  {
	
	 public static void main(String[] args) {
	        System.out.println(sum(1));
	        System.out.println(sum(1,2)); //compiler error, ambiguous method

	    }

	    public static int sum(int...js ){
	        System.out.println("sum1 called");
	        int sum=0 ;
	        for(int x : js){
	            sum+=x;
	        }
	        return sum;
	    }
	    public static int sum(int i,int k,int...js ){
	        System.out.println("sum2 called");
	        int sum = i;
	        for(int x : js){
	            sum+=x;
	        }
	        return sum;
	    }
	    
	  }





package com.qait.demo;

public class OverloadingDemo {
	
	public void fun() {
		System.out.println("simple void type method");
		
	}
	 int fun(int a) {
		System.out.println("int type method with three arg");
		return 0;
		
	}
	private int fun(int a, int b,int c) {
		System.out.println("int type method with three arg");
		return 0;
		
	}
	final protected int fun(String a,int b) {
		System.out.println("final -----int type method with 2 arg- one is string , second one is int");
		return 0;
		
	}
	
	static public int fun(String a,int b,int c) {
		System.out.println("static -----int type method with 3 arg - one string and 2 are int");
		return 0;
		
	}
	
	protected String fun(String a,String b) {
		System.out.println("String type method with 2 string type arg");
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingDemo ob = new OverloadingDemo();
		ob.fun();
		ob.fun(2,3,5);
		fun("bye", 3, 5);
		ob.fun("hello", 9);
		ob.fun("1", "1");
		
		
		
	}

}

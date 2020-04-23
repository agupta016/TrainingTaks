package com.qait.demo;

public class OverridingDemo extends OverloadingDemo{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		super.fun();
		System.out.println("hello child");
	}
		
	@Override
	int fun(int a) {
		System.out.println("child");
		return super.fun(a);
	}
	
	// error can't override final method
//	@Override
//	public int fun(String a, int b) {
//		System.out.println("child");
//		return 0;
//	}
	
	// error this instance can't override static method
//	public int fun(String a, int b, int c) {
//	
//		System.out.println("child");
//		return super.fun(a, b, c);
//	}
	
	@Override
	protected String fun(String a, String b) {
		System.out.println("child");
		return super.fun(a, b);
	}
	
	
	public static void main(String[] args) {
		
		OverridingDemo ob = new OverridingDemo();
		ob.fun();
		ob.fun(3);
//		ob.fun(2,3,5);   // error (this method i private)
		ob.fun("bye", 3, 5);
		ob.fun("hello", 9);
		ob.fun("1", "1");
 
	}

}

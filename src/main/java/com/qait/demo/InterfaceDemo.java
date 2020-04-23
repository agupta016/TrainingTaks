package com.qait.demo;

interface showMsg{
	void msg();
}


interface solution extends showMsg {
public void Hello();
public void Welcome();
interface InnerInterface{
      void InnerMethod();
  }
}




public class InterfaceDemo implements solution {
    public void Hello() {
        System.out.println("Hello world");
   }
   public void Welcome() {
        System.out.println("Welcome");
   }
        
     public void InnerMethod() {
        	System.out.println("innner inerface");
        }
     
     public void msg() {
    	 System.out.println("Messgae in demo class");
     }
     
public static void main(String[] args) {
	InterfaceDemo ob = new InterfaceDemo();
   ob.Hello();
   ob.Welcome();
   ob.InnerMethod();
   ob.msg();
   
   }

}

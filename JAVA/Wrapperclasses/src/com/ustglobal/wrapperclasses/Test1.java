package com.ustglobal.wrapperclasses;

public class Test1 
{
  public static void main(String[] args) 
  {
	int a=10;
	System.out.println("a is = "+a);
	Integer i=a;//Boxing or Auto boxing
	System.out.println("i is = "+i);
	Integer x=10;
	Integer z=new Integer(20);
	System.out.println("x is = "+x);
	int y=x;//Unboxing or Auto unboxing
	System.out.println("y is = "+y);
  }
}

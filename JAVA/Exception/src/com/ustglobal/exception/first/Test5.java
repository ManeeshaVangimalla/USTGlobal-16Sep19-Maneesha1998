package com.ustglobal.exception.first;

public class Test5 {
   public static void main(String[] args) {
	System.out.println("main started");
	
	String s1="hello";
	int[] a= {10,20,30};
	int b=10;
	try {
		String s2=s1.toUpperCase();
		System.out.println(s2);
		System.out.println(a[2]);
		System.out.println(b/0);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("main ended");
}
}

package com.jspiders.demoapp;
import java.util.Scanner;
public class SwapNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number:");
	int a=sc.nextInt();
	System.out.println("enter the second number:");
	int b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
}
}

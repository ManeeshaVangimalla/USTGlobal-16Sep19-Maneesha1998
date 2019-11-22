package com.jspiders.demoapp;
import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number:");
	int a=sc.nextInt();
	System.out.println("enter the second number:");
	int b=sc.nextInt();
	int t;
	t=a;
	a=b;
	b=t;
	System.out.println("swapping of two numbers are "+ a +" and "+ b );
}
}

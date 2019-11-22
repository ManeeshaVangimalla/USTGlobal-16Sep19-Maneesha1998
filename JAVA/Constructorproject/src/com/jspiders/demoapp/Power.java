package com.jspiders.demoapp;
import java.util.Scanner;
public class Power {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
	System.out.println("enter the power:");
	int p=sc.nextInt();
	int pw=1;
	while(p>0)
	{
		pw=pw*n;
		p--;
	}
	System.out.println("power of a number is "+pw);
}
}

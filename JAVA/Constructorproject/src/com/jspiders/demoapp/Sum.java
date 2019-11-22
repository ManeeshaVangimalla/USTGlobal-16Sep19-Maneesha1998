package com.jspiders.demoapp;
import java.util.Scanner;
public class Sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
	int sum=0,i=1;
	while(i<=n)
	{ 
     sum=sum+i;
     i++;
	}
	System.out.println("sum of first N Numbers is "+sum);
}
}

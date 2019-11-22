package com.jspiders.demoapp;
import java.util.Scanner;
public class Even {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
	        int n=sc.nextInt();
	        if(n%2==0)
	        	System.out.println(n +" is even number");
	        else
	        	System.out.println(n +" is odd number");
	        	
}
}

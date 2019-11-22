package com.ustglobal.beanobject.bean;
import java.util.Scanner;

public class Test2 {
   public static void main(String[] args) {
	   System.out.println("Scanner class");
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter age");
	   int age=sc.nextInt();
	   System.out.println("Age is = "+age);
	   System.out.println("Enter name");
	   String name=sc.next();
	   System.out.println("Name is = "+name);
	   System.out.println("Enter College name");
	   String cname=sc.nextLine();
	   System.out.println("College name is = "+cname);
}
}


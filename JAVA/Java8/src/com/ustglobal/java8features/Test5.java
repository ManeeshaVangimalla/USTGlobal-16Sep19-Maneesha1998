package com.ustglobal.java8features;

import java.util.function.Supplier;

public class Test5 {
  public static void main(String[] args) {
	
	  Supplier<Student> s=() -> new Student(2,"vijay",55.5);
	  Student s1=s.get();
	  System.out.println("Id is = "+s1.id);
	  System.out.println("Name is = "+s1.name);
	  System.out.println("Percentage is = "+s1.percentage);
	  
	  System.out.println("--------------------------");
	  
	  Supplier<Integer> i=() -> 20;
	  int val=i.get();
	  System.out.println("Value is = "+val);
	  
      System.out.println("--------------------------");
	  
	  Supplier<String> sp=() -> "Good Evening";
	  String v=sp.get();
	  System.out.println("Value is = "+v);

}
}

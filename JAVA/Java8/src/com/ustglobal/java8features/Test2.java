package com.ustglobal.java8features;

import java.util.function.Predicate;

public class Test2 {
      
	public static void main(String[] args) {
		
		Predicate<Student> p= s -> {
			if(s.percentage >=35) {
				return true;
			}else {
				return false;
			}
		};
	    Student s1=new Student(11,"maneesha",90.90);
	    boolean value=p.test(s1);
	    System.out.println("Rsult = "+value);
	 }
}

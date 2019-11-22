package com.ustglobal.java8features;

import java.util.ArrayList;

public class Test7 {
   public static void main(String[] args) {
	
	   ArrayList<Student> al=new ArrayList<>();
	   al.add(new Student(5,"vikram",56.7));
	   al.add(new Student(3,"vijay",35.8));
	   al.add(new Student(6,"yash",37.7));
	   al.add(new Student(2,"akshay",65.8));
	   al.add(new Student(1,"aishu",90.99));
	   Helper h=new Helper();
	   //h.displayAllStudents(al);
	   //h.displayFailedStudents(al);
	   //h.displayPassedStudents(al);
	   h.topperOfClass(al);
}
}

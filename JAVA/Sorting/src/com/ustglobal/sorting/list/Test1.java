package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test1 {
     
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(12,"dimple",20.34);
		Student s2=new Student(2,"Sweety",98.67);
		Student s3=new Student(34,"jimmy",68.9);
		Student s4=new Student(5,"tummy",76.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("before sorting-------");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("after sorting-------");
		displayStudentDetails(al);
	}
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println("id is = "+s.id);
			System.out.println("name is = "+s.name);
			System.out.println("percentage is = "+s.percentage);
			System.out.println("----------------------------");
		}
	}
}

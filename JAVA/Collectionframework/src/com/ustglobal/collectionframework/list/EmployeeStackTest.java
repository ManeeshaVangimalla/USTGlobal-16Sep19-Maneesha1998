package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class EmployeeStackTest {
     
	public static void main(String[] args) {
		
		Stack<Employee> s=new Stack<Employee>();
		Employee e1=new Employee(1,"Rupa",23000);
	     Employee e2=new Employee(2,"Prasad",35000);
	     Employee e3=new Employee(3,"Ramesh",43000);
	     s.add(e1);
	     s.add(e2);
	     s.add(e3);

   	  System.out.println("------using for loop--------");
   	  for(int i=0;i<s.size();i++) {
   		  System.out.println(s.get(i));
   	  }
   	  
   	  System.out.println("----using for each-------");
   	  for(Object object : s) {
   		  System.out.println(object);
   	  }
   	  
   	  System.out.println("-----using iterator--------");
   	  Iterator i=s.iterator();
   	  while(i.hasNext()) {
   		  Object o=i.next();
   		  System.out.println(o);
   	  }
   	  
   	  System.out.println("----using list iterator");
   	  ListIterator li1=s.listIterator();
   	  while(li1.hasNext()) {
   		  Object ob=li1.next();
   		  System.out.println(ob);
   	  }
   	  System.out.println("------using prevoius----");
   	  while( li1.hasPrevious()) {
   		  Object o1=li1.previous();
   		  System.out.println(o1);
   	  }
	}
		
	}


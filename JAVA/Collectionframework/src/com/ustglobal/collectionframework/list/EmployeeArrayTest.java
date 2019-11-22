package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeArrayTest {
     
	 public static void main(String[] args) {
		
		 ArrayList<Employee> al=new ArrayList<Employee>();
	    	Employee e1=new Employee(1,"Chaitu",30000);
	    	Employee e2=new Employee(2,"Pranathi",40000);
	    	Employee e3=new Employee(3,"Nandhitha",50000);
	    	
	    	al.add(e1);
	    	al.add(e2);
	    	al.add(e3);
	    	System.out.println("----using for loop-------");
	    	for(int i=0;i<al.size();i++) {
	    		Employee e=al.get(i);
	    		System.out.println("Id is = "+e.id);
	    		System.out.println("Name is = "+e.name);
	    		System.out.println("Percentage is = "+e.salary);
	    	}
	    	System.out.println("---for each-------");
	    	for(Employee e:al) {
	    		System.out.println(e);
	    	}
	    	System.out.println("-----using iterator--------");
	     	  Iterator i=al.iterator();
	     	  while(i.hasNext()) {
	     		  Object o=i.next();
	     		  System.out.println(o);
	     	  }
	     	  
	     	  System.out.println("----using list iterator");
	     	  ListIterator li1=al.listIterator();
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

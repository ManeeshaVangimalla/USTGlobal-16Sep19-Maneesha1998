package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeLinkedTest {
       
	public static void main(String[] args) {
		
		LinkedList<Employee> li=new LinkedList<Employee>();
  	    Employee e4=new Employee(4,"Maneesha",60000);
  	    Employee e5=new Employee(5,"Karthik",70000);
  	    Employee e6=new Employee(6,"Ram",80000);
  	    
  	    li.add(e4);
  	    li.add(e5);
  	    li.add(e6);
      
  	    System.out.println("------using for loop--------");
  	     for(int i=0;i<li.size();i++) {
  		  System.out.println(li.get(i));
  	     }
  	  
  	      System.out.println("----using for each-------");
  	       for(Object object : li) {
  		  System.out.println(object);
  	      }
  	  
  	     System.out.println("-----using iterator--------");
  	      Iterator i=li.iterator();
  	      while(i.hasNext()) {
  		  Object o=i.next();
  		  System.out.println(o);
  	     }
  	  
  	      System.out.println("----using list iterator");
  	      ListIterator li1=li.listIterator();
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

package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TeacherLinkedTest {
      
	public static void main(String[] args) {
		
		LinkedList<Teacher> li=new LinkedList<Teacher>();
  	    Teacher t1=new Teacher(4,"Maneesha","Maths");
  	    Teacher t2=new Teacher(5,"Karthik","Physics");
  	    Teacher t3=new Teacher(6,"Ram","Telugu");
  	    
  	    li.add(t1);
  	    li.add(t2);
  	    li.add(t3);
      
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


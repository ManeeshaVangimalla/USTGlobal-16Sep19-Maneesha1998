package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Test9 {
  
	 public static void main(String[] args) {
		
		 Stack s=new Stack();
		s.add(12);
   	    s.add(739.97);
   	    s.add("Maneesha");
   	    s.add(true);
   	    s.add(null);

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

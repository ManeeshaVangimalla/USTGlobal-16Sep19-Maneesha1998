package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TeacherVectorTest {
   
	public static void main(String[] args) {
		
		Vector<Teacher> v=new Vector<Teacher>();
		Teacher t1=new Teacher(4,"Maneesha","Maths");
  	    Teacher t2=new Teacher(5,"Karthik","Physics");
  	    Teacher t3=new Teacher(6,"Ram","Telugu");
  	    
	     v.add(t1);
	     v.add(t2);
	     v.add(t3);

  	  System.out.println("------using for loop--------");
  	  for(int i=0;i<v.size();i++) {
  		  System.out.println(v.get(i));
  	  }
  	  
  	  System.out.println("----using for each-------");
  	  for(Object object : v) {
  		  System.out.println(object);
  	  }
  	  
  	  System.out.println("-----using iterator--------");
  	  Iterator i=v.iterator();
  	  while(i.hasNext()) {
  		  Object o=i.next();
  		  System.out.println(o);
  	  }
  	  
  	  System.out.println("----using list iterator");
  	  ListIterator li1=v.listIterator();
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

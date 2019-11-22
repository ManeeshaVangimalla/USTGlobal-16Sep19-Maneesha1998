package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TeacherArrayTest {

	public static void main(String[] args) {
		
		ArrayList<Teacher> al=new ArrayList<Teacher>();
		Teacher t1=new Teacher(4,"Maneesha","Maths");
  	    Teacher t2=new Teacher(5,"Karthik","Physics");
  	    Teacher t3=new Teacher(6,"Ram","Telugu");
  	    
    	
    	al.add(t1);
    	al.add(t2);
    	al.add(t3);
    	System.out.println("----using for loop-------");
    	for(int i=0;i<al.size();i++) {
    		Teacher e=al.get(i);
    		System.out.println("Id is = "+e.id);
    		System.out.println("Name is = "+e.name);
    		System.out.println("Percentage is = "+e.subject);
    	}
    	System.out.println("---for each-------");
    	for(Teacher e:al) {
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

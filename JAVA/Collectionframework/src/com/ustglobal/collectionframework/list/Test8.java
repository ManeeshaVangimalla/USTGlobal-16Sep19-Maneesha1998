package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test8 {
      
	   public static void main(String[] args) {
		
		   Vector v=new Vector();
		      v.add(12);
	    	  v.add(739.97);
	    	  v.add("Maneesha");
	    	  v.add(true);
	    	  v.add(null);

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

package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test5 {
   public static void main(String[] args) {
	
	   TreeSet ts=new TreeSet();
	   ts.add(34);
	   ts.add(45);
	   ts.add(12);
	   ts.add(9);
	   ts.add(39);
	   
	    System.out.println("***using for each***");
   	    for(Object o:ts) {
   		System.out.println(o);
     	}
   	     System.out.println("***using iterator");
   	      Iterator it=ts.iterator();
   	    while(it.hasNext()) {
   		 Object s=it.next();
   		 System.out.println(s);
   	   }
}
}

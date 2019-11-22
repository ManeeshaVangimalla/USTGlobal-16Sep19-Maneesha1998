package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test6 {
    
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
		
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

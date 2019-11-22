package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test4 {
    public static void main(String[] args) {
		
    	LinkedHashSet<Double> ls=new LinkedHashSet<Double>();
    	ls.add(62.6);
    	ls.add(21.45);
    	ls.add(60.00);
    	ls.add(98.12);
    	
    	System.out.println("***using for each***");
    	for(Object o:ls) {
    		System.out.println(o);
    	}
    	 System.out.println("***using iterator");
    	 Iterator<Double> it=ls.iterator();
    	 while(it.hasNext()) {
    		 Object s=it.next();
    		 System.out.println(s);
    	 }
	}
}

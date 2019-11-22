package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test5 {
       public static void main(String[] args) {
		  ArrayList<Pen> al=new ArrayList<Pen>();
    	   Pen p1=new Pen(20,"Camlin");
    	   Pen p2=new Pen(10,"Reynolds");
    	   Pen p3=new Pen(90,"Cello");
    	   Pen p4=new Pen(40,"Elcos");
    	   al.add(p1);
    	   al.add(p2);
    	   al.add(p3);
    	   al.add(p4);
    	   
    	   System.out.println("before sorting-----");
    		  displayPenDetails(al);
    		  Collections.sort(al);
    		  System.out.println("after sorting-----");
    	       displayPenDetails(al);
    	   
	}
       static void displayPenDetails(ArrayList<Pen> al) {
      	 Iterator<Pen> it=al.iterator();
      	 while(it.hasNext()) {
      		 Pen p=it.next();
      		 System.out.println("brand is = "+p.brand);
      		 System.out.println("Price is = "+p.price);
      		 
      	 }
}
}

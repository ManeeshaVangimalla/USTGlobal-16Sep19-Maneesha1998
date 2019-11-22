package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test6 {
      public static void main(String[] args) {
		
    	  ArrayList<String> al=new ArrayList<String>();
    	  al.add("Anupama");
    	  al.add("Savitha");
    	  al.add("Samantha");
    	  al.add("Rakulpreet");
    	  al.add("kajal");
    	  al.add("Soundarya");
    	  
    	  String name=al.get(0);
    	  System.out.println(name);
    	  Iterator<String> li=al.iterator();
    	  while(li.hasNext()) {
    		  String s=li.next();
    		  System.out.println(s);
    	  }
    	  System.out.println("------using list iterator------");
    	  ListIterator<String> l=al.listIterator();
    	  while(l.hasNext()) {
    		  String s=l.next();
    		  System.out.println(s);
    	  }
    	  System.out.println("------using for each-----");
    	  
    	  for(String n:al) {
    		  System.out.println(n);
    	  }
	}
}

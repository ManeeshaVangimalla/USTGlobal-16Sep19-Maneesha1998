package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test4 {
  public static void main(String[] args) {
	  
	  ArrayList al=new ArrayList();
	  al.add(10);
	  al.add(23.89);
	  al.add("yash");
	  al.add(true);
	  
	  ListIterator li=al.listIterator();
	  System.out.println("-------------->Forward");
	  while(li.hasNext()) {
		  Object ob=li.next();
		  System.out.println(ob);
	  }
	  
	  System.out.println("Backward<--------------");
	  
	  while(li.hasPrevious()) {
		  Object o=li.previous();
		  System.out.println(o);
	  }
}
}

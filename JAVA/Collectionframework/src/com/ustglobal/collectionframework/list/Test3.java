package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(34);
		al.add(54.56);
		al.add(true);
		al.add("Good evening");
		
		
		Iterator it=al.iterator();
		Object o1=it.next();
		System.out.println(o1);
		
		Object o2=it.next();
		System.out.println(o2);
		
		Object o3=it.next();
		System.out.println(o3);
		
		boolean b1=it.hasNext();
		System.out.println("Hasnext = "+b1);
		
		Object o4=it.next();
		System.out.println(o4);
		
		boolean b=it.hasNext();
		System.out.println("Hasnext = "+b);
		
	//	Object o5=it.next();
	//	System.out.println(o5);
		//nosuchelementexception
		
		System.out.println("----------for loop----------------------");
		
		for(int i=0;i<al.size();i++) {
			Object o=al.get(i);
			System.out.println(o);
		}
		ArrayList al1=new ArrayList();
		al1.add(12);
		al1.add(35.786);
		al1.add("momo");
		al1.add(false);
		
		System.out.println("------------using iteratot--------------");
		Iterator it1=al1.iterator();
		while(it1.hasNext()) {
			Object o=it1.next();
			System.out.println(o);
		}
	}
}

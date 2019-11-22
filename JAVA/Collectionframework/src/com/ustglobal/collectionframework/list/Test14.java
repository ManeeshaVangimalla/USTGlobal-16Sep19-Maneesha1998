package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class Test14 {
   
	public static void main(String[] args) {
		
		LinkedList<Integer> l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println("after sort = "+l);
		Collections.sort(l);
		System.out.println("after sort = "+l);
		
		Collections.reverse(l);
		System.out.println("after reverse = "+l);
		
		Collections.shuffle(l);
		System.out.println("after shuffle = "+l);
	}
}

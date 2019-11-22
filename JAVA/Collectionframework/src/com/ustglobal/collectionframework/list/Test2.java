package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class Test2 {
  
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(23.45);
		al.add(true);
		al.add("chinni");
		
		for(Object o:al) {
			System.out.println(o);
		}
	}
}

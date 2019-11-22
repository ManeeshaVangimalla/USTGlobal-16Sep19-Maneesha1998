package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class Test15 {
    
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("girija");
		al.add("vanaja");
		al.add("jalaja");
		al.add("kiran");
		
		System.out.println("before sort----->"+al);
		Collections.sort(al);
		System.out.println("after sort------>"+al);
		
	}
}

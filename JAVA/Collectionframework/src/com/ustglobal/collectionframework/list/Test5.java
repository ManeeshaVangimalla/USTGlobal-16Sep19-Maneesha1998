package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
		
    	ArrayList al=new ArrayList();
    	al.add("Shriya");
    	
    	Object o=al.get(0);
    	String s=(String)o;
    	s=s.toUpperCase();
    	System.out.println(s);
    	System.out.println(o);
}
}

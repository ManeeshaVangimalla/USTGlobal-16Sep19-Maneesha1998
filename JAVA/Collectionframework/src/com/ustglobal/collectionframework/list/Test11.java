package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
     
	public static void main(String[] args) {
		
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(45.83);
		al.add(12.70);
		al.add(89.21);
		al.add(24.90);
		al.add(51.09);
		al.add(45.83);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		al.add(2,78.12);
		System.out.println("after add in 2nd index "+al);
		al.remove(0);
		System.out.println("after removing 0th index "+al);
		al.remove(null);
		System.out.println("after removing null "+al);
		Double val=al.get(4);
		System.out.println("object at 4th index "+val);
		al.set(2,77.66);
		System.out.println("after replacing 2nd index "+al);
		al.clear();
		System.out.println("after clear method "+al);
		boolean a=al.contains(78.12);
		System.out.println(a);
		
		List<Double> al1=new ArrayList<>();
		al1.add(79.7);
		al1.add(33.3);
		al1.add(52.2);
		
		al.addAll(al1);
		System.out.println("after add all "+al);
		boolean contain=al.containsAll(al1);
		System.out.println("Contains all of al1 "+contain);
		boolean rem=al.removeAll(al1);
		System.out.println("Removed all of al1 "+rem);
		
	}
}

















package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test6 {
    
	public static void main(String[] args) {
		
		ArrayList<Marker> al=new ArrayList<Marker>();
		al.add(new Marker(50,"Blue"));
		al.add(new Marker(70,"Red"));
		al.add(new Marker(80,"Green"));
		al.add(new Marker(40,"Black"));
		
		System.out.println("Before sorting--------");
		display(al);
		SortByPrice sp=new SortByPrice();
		//Collections.sort(al,sp);
		SortByColor sc=new SortByColor();
		Collections.sort(al,sc);
		System.out.println("after sorting--------");
		display(al);
		
	}
	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it=a.iterator();{
			while(it.hasNext()) {
				Marker m=it.next();
				System.out.println("Price is = "+m.price);
				System.out.println("Color is = "+m.color);
				System.out.println("----------------------");
			}
		}
		
	}
}

package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;
 class Test9 {
   
	public static void main(String[] args) {
		
		//SortByName sn=new SortByName();
		//SortByPincode sp=new SortByPincode();
		SortByMicr sm=new SortByMicr();
		TreeSet<Bank> ts=new TreeSet<Bank>(sm);
		Bank b1=new Bank("HDFC",560068,6768689);
		Bank b2=new Bank("SBI",560071,9898989);
		Bank b3=new Bank("CITI",560054,765678);
		Bank b4=new Bank("CANARA",560076,123456);
		Bank b5=new Bank("CANARA",560076,123456);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("*********using iterator*********");
		Iterator<Bank> it=ts.iterator();
		while(it.hasNext()) {
			Bank b=it.next();
			System.out.println("Name is = "+b.name);
			System.out.println("Pincode is = "+b.pincode);
			System.out.println("MICR is = "+b.micr);
			System.out.println("---------------------------------");
		}
	}
}

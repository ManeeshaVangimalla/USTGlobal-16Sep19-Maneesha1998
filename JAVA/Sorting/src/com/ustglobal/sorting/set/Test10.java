package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test10 {
     public static void main(String[] args) {
		 EmpSortByName sn=new EmpSortByName();
    	 TreeSet<Customer> ts=new TreeSet<Customer>(sn);
    	 Customer c1=new Customer("Maneesha",1,40000);
    	 Customer c2=new Customer("Pravs",2,30000);
    	 Customer c3=new Customer("Chaitu",5,20000);
    	 Customer c4=new Customer("Kavya",4,90000);
    	 
    	 ts.add(c1);
 		ts.add(c2);
 		ts.add(c3);
 		ts.add(c4);
 		
 		
 		System.out.println("*********using iterator*********");
 		Iterator<Customer> it=ts.iterator();
 		while(it.hasNext()) {
 			Customer c=it.next();
 			System.out.println("Name is = "+c.name);
 			System.out.println("Id is = "+c.id);
 			System.out.println("Salary is = "+c.salary);
 			System.out.println("---------------------------------");
 		}
	}
}

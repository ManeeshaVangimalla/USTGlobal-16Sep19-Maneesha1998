package org.jsp.colapp;
import java.util.List;
import java.util.ArrayList;
public class EmpTest {
	public static void main(String[] args) {
		Employee e1=new Employee(1,2000,"maneesha");
		Employee e2=new Employee(2,3000,"chaitu");
		Employee e3=new Employee(3,4000,"kavya");
		Employee e4=new Employee(4,5000,"pandu");
        System.out.println(e1);
         List<Employee> lst=new ArrayList<Employee>();
         lst.add(e1);
         lst.add(e2);
         lst.add(e3);
         lst.add(e4);
         for(int i=0;i<lst.size();i++)
         {
        	 Employee ele=lst.get(i);
        	 System.out.println(ele);
         }
         for(Employee emp:lst)
         {
        	 System.out.println(emp);
         }
}
}

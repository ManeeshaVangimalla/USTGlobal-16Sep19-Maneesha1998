package com.ustglobal.beanobject.bean;

public class Test1 {
   public static void main(String[] args) {
	  Student s=new Student();
	  s.setId(12);
	  s.setName("Shivagami");
	  s.setRollNo(134);
	  
	  Employee e=new Employee();
	  e.setId(24);
	  e.setSalary(30000);
	  e.setName("Maneesha");
	  e.setDept("Development");
	  e.setDesignation("Softwareengineer");
	  
	  Database db=new Database();
	  db.receive(s);
	  db.save(e);
}
}

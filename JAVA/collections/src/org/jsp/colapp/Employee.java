package org.jsp.colapp;

public class Employee {
	int id,salary;
	String name;
	public Employee(int id,int salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
@Override
public String toString()
{
 return this.name+" id is "+this.id+"  salary is "+this.salary;
}
}

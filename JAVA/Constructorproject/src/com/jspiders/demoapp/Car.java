package com.jspiders.demoapp;

public class Car {
	String RegNum;
	int Price;
	Car(String rg,int p)
	{
		this.RegNum=rg;
		this.Price=p;
	}
	public static void main(String[] args)
	{
		Car c1=new Car("abo423" ,300000);
		Car c2=new Car("ka0463" ,400000);
		System.out.println(c1.RegNum+" "+c1.Price);
		System.out.println(c2.RegNum+" "+c2.Price);
	}	

}

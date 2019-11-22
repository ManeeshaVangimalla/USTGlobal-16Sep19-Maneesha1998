package com.ustglobal.typecasting.reference;

public class Test1  
{
	public static void main(String[] args) 
	{
		Pen p=new Marker();//Upcasting
        System.out.println(p.cost);
        p.write();
        System.out.println();
        Marker m=(Marker)p;
        System.out.println(m.size);
        m.color();
        m.write();
	} 
}

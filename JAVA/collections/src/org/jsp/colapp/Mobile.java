package org.jsp.colapp;

public class Mobile {
  String model,clr;
  int price;
  @Override
	public String toString() 
    {
		
		return this.model+" mobile color is "+this.clr + " and price is "+this.price;
	}
  public Mobile(String model,String clr,int price)
  {
	  this.model=model;
	  this.clr=clr;
	  this.price=price;
  }
}

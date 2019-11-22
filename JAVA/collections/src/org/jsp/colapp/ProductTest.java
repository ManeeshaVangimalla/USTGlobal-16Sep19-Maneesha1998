package org.jsp.colapp;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
public class ProductTest {
public static void main(String[] args) {
	Product p1=new Product();
	Product p2=new Product();
	p1.setPrice(72);
	p1.setQty(56);
	p1.setType("tomato");
	p2.setPrice(555);
	p2.setQty(69);
	p2.setType("brinjal");
	System.out.println(p1.getPrice()+"  " +p1.getQty()+ "  "+p1.getType());
    System.out.println(p2.getPrice()+" " +p2.getQty()+ "  "+p2.getType());
	List<Product> p =new ArrayList<Product>();
	p.add(p1);
	p.add(p2);
	for(int i=0;i<p.size();i++)
	{
		Product s=p.get(i);
		System.out.println(s);
		}
}
}



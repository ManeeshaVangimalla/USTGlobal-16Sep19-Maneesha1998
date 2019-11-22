package org.jsp.colapp;
import java.util.List;
import java.util.Vector;
import java.util.Iterator;
public class MobileTest {
  public static void main(String[] args) {
	Mobile m1=new Mobile("samsung","blue",20000);
	Mobile m2=new Mobile("iphone","pink",40000);
	Mobile m3=new Mobile("oppo","black",30000);
	Mobile m4=new Mobile("honour","gold",50000);
	List<Mobile> lst=new Vector<Mobile>();
	lst.add(m1);
	lst.add(m2);
	lst.add(m3);
	lst.add(m4);
	Iterator<Mobile> itr=lst.iterator();
	while(itr.hasNext())
	{
		Mobile mb=itr.next();
		System.out.println(mb);
	}
	
}
}

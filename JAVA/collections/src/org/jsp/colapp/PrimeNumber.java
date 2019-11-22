package org.jsp.colapp;
import java.util.Scanner;
public class PrimeNumber
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int count=1,i=1;
	while(i<=n/2)
	{
		if(n%i==0)
			count=count+1;
		    if(count>2)
		    	break;
			i++;
	}
	if(count==2)
	 System.out.println(n + "is prime number");
	else
		System.out.println(n + "is not a prime number");
  }
}

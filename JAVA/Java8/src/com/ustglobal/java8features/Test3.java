package com.ustglobal.java8features;

import java.util.function.Function;

public class Test3 {
    
	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;
		
		int res5=f.apply(5);
		System.out.println("Square of 5 = "+res5);
		
		int res4=f.apply(4);
		System.out.println("Square of 4 = "+res4);

	}
}

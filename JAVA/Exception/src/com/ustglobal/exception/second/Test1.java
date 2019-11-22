package com.ustglobal.exception.second;

public class Test1 {
	public static void main(String[] args) {

		try {

			Thread.sleep(3000);
			System.out.println("inside try");

		}
		catch(InterruptedException ie) {

			System.out.println("Exception caught");
			ie.printStackTrace();

		}

		System.out.println("main ended");
	}
}

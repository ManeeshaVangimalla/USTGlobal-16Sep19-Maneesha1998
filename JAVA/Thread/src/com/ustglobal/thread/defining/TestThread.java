package com.ustglobal.thread.defining;

public class TestThread {
  public static void main(String[] args) {
	  
	  System.out.println("main started");
	  
	  MyThread t1 = new MyThread();
	 
		/*
		 * dont't call run() method,it behaves like normal program all code will execute
		 * inside main thread only
		 */
//    t1.run();
	  
	  t1.start();
	  //t1.start(); IllegalThreadStateException
	  
	  for(int i=0;i<10;i++) {
		  System.out.println("Main Thread");
	  }
	  
	  System.out.println("Main ended");
}
}

package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
   public static void main(String[] args) {
	  
	   System.out.println("main started");
	   
	   
	   ValidateAmount va=new ValidateAmount();
	   try {
		va.checkAmount(70000);
	} catch (InvalidAmountException e) {
		
		;
		System.out.println(e.getMessage());
	}
	   
	   System.out.println("main ended");
}
}

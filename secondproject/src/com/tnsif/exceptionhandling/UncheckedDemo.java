package com.tnsif.exceptionhandling;


	

	public class UncheckedDemo {
	    public static void main(String[] args) {
	        int a = 10, b = 0;
	        int result = a / b;   // ArithmeticException at runtime
	        System.out.println("Result: " + result);
	    }
	}






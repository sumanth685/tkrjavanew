package com.second.se;

public class Operators {
	public static void main(String args[]) {
		//this program demonstrates operators in java
		//1.Arithmetic operators
		 int a = 10,b=3,c=5,result,f=7;
	     
	     
	      
	        
	       System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));
	        
	        
	        //2.unary operators
	        
	        System.out.println("Postincrement : " + (a++));
	        System.out.println("Preincrement : " + (++a));

	        System.out.println("Postdecrement : " + (b--));
	        System.out.println("Predecrement : " + (--b));
	        //assignment operators
	        
	        System.out.println("f += 3: " + (f += 3));
	        System.out.println("f -= 2: " + (f -= 2));
	        System.out.println("f *= 4: " + (f *= 4));
	        System.out.println("f /= 3: " + (f /= 3));
	        System.out.println("f %= 2: " + (f %= 2));
	        //3.Relational operators
	        
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));
	        System.out.println("a == c: " + (a == c));
	        System.out.println("a != c: " + (a != c));
	        //4.logical Operators
	        boolean x = true;
	        boolean y = false;
	      
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));
	        //5.Ternary Operator
	        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	        System.out.println("Max of three numbers = "+ result);
	        //6.bitwise operators
	        int d = 0b1010;
	        int e = 0b1100;
	      
	        System.out.println("d & e : " + (d & e));
	        System.out.println("d | e : " + (d | e));
	        System.out.println("d ^ e : " + (d ^ e));
	        System.out.println("~d : " + (~d));
	        System.out.println("d << 2 : " + (d << 2));
	        System.out.println("e >> 1 : " + (e >> 1));
	        System.out.println("e >>> 1 : " + (e >>> 1));
	        //7.Shift operators
	     // Using left shift
	        System.out.println("a<<1 : " + (a << 1));
	      
	        // Using right shift
	        System.out.println("a>>1 : " + (a >> 1));
	    }
	         
	          
	    
	
		
		
	
	

}

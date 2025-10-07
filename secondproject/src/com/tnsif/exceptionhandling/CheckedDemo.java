package com.tnsif.exceptionhandling;


	

	import java.io.FileReader;
	import java.io.IOException;

	public class CheckedDemo {
	    public static void main(String[] args) {
	        try {
	            FileReader fr = new FileReader("nonexistent.txt"); // File may not exist
	            System.out.println("File opened successfully!");
	        } catch (IOException e) {
	            System.out.println(" Checked Exception caught: " + e.getMessage());
	        }
	    }
	}

	//output
	//
	//⚠ Checked Exception 



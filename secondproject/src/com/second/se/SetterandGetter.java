package com.second.se;

public class SetterandGetter {// Example: Student class with getter and setter methods
	
	    // Private data members (Encapsulation)
	    private String name;
	    private int age;

	    // Getter for 'name'
	    public String getName() {
	        return name;
	    }

	    // Setter for 'name'
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for 'age'
	    public int getAge() {
	        return age;
	    }

	    // Setter for 'age'
	    public void setAge(int age) {
	        // Validation example: age must be positive
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age!");
	        }
	    }
	

	// Main class to test

	    public static void main(String[] args) {
	        SetterandGetter s1 = new SetterandGetter();

	        // Using setter methods to set values
	        s1.setName("Sumanth");
	        s1.setAge(21);

	        // Using getter methods to get values
	        System.out.println("Name: " + s1.getName());
	        System.out.println("Age: " + s1.getAge());

	        // Trying invalid age
	        s1.setAge(-5); // Will print "Invalid age!"
	    }
	}




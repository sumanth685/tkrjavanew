package Stringsexamples;

public class StringMethods {
	
	    public static void main(String[] args) {
	        String str = "Hello World";

	        // length()
	        System.out.println("Length: " + str.length());

	        // charAt()
	        System.out.println("Character at index 4: " + str.charAt(4));

	        // substring()
	        System.out.println("Substring (0 to 5): " + str.substring(0, 5));

	        // equals() and equalsIgnoreCase()
	        System.out.println("Equals 'Hello World': " + str.equals("Hello World"));
	        System.out.println("EqualsIgnoreCase 'hello world': " + str.equalsIgnoreCase("hello world"));

	        // toUpperCase() and toLowerCase()
	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());

	        // contains()
	        System.out.println("Contains 'World': " + str.contains("World"));

	        // startsWith() and endsWith()
	        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
	        System.out.println("Ends with 'World': " + str.endsWith("World"));
	    }
	}




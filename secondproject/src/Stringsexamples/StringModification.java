package Stringsexamples;

public class StringModification {
	
	    public static void main(String[] args) {
	        String str = "  Java Programming  ";

	        // trim()
	        System.out.println("Trimmed: '" + str.trim() + "'");

	        // replace()
	        System.out.println("Replace: " + str.replace("Java", "Python"));

	        // concat()
	        String str2 = " is fun!";
	        System.out.println("Concat: " + str.trim().concat(str2));

	        // split()
	        String[] words = str.trim().split(" ");
	        System.out.println("Split words:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // indexOf() and lastIndexOf()
	        String text = "Programming in Java Programming";
	        System.out.println("First index of 'Programming': " + text.indexOf("Programming"));
	        System.out.println("Last index of 'Programming': " + text.lastIndexOf("Programming"));
	    }
	}




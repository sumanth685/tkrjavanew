package Stringsexamples;

public class StringBufferDemo1 {
	
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer("Hello");

	        // append()
	        sb.append(" World");
	        System.out.println("After append: " + sb);

	        // insert()
	        sb.insert(5, " Java");
	        System.out.println("After insert: " + sb);

	        // delete()
	        sb.delete(5, 10);
	        System.out.println("After delete: " + sb);

	        // replace()
	        sb.replace(6, 11, "Universe");
	        System.out.println("After replace: " + sb);

	        // reverse()
	        sb.reverse();
	        System.out.println("After reverse: " + sb);
	    }
	}




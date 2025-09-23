package Stringsexamples;

public class StringBufferdemo2 {
	
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer("Programming");

	        // charAt()
	        System.out.println("Character at 2: " + sb.charAt(2));

	        // setCharAt()
	        sb.setCharAt(0, 'p');
	        System.out.println("After setCharAt: " + sb);

	        // substring()
	        System.out.println("Substring (0, 6): " + sb.substring(0, 6));
	       

	                System.out.println("Initial capacity: " + sb.capacity()); // 16

	                sb.append("Java");
	                System.out.println("Length: " + sb.length());
	                System.out.println("Capacity: " + sb.capacity());

	                sb.append(" Programming Language is Powerful");
	                System.out.println("Length after append: " + sb.length());
	                System.out.println("Capacity after append: " + sb.capacity());

	                // ensureCapacity()
	                sb.ensureCapacity(50);
	                System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
	            }
	        

	    }
	




package com.tnsif.collections;



	import java.util.*;

	public class HashSetDemo {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Apple"); // duplicate ignored

	        System.out.println("HashSet Elements: " + set);

	        set.remove("Banana");
	        System.out.println("After Removal: " + set);
	    }
	}






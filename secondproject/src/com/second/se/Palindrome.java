package com.second.se;

public class Palindrome {

	public static void main(String[] args) {
		int num=232,dup=num,last;
		int revdig=0;
		while(num>0) {
			last=num%10;
			revdig=revdig*10+last;
			num=num/10;
			
		}
		if(revdig==dup) {
			System.out.println(dup + " is a Palindrome");
		}
		else {
			System.out.println(dup + " is not palindrome");
		}
	

	}

}

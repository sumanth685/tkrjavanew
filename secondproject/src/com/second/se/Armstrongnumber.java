package com.second.se;

public class Armstrongnumber {

	public static void main(String[] args) {
		int num=153,ld,dup=num;
		int sum=0;
		while(num>0) {
			ld=num%10;
			sum=sum+(ld*ld*ld);
			num=num/10;
			
		}
		if(sum==dup) {
			System.out.println(dup + "is an Armstrong Number");
		}
		else {
			System.out.println(dup + "is not an Armstrong number");
		}

	}

}

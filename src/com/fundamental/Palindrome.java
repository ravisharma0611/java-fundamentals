package com.fundamental;

public class Palindrome {
	
	public void palindrome(int num) {
		
		int temp = num;
		int rev = 0;
		int sum = 0;
		
		//reverse
		while(num > 0) {
			rev = num % 10;
			sum  = (sum*10)+rev;
			num = num/10;
		}
		System.out.println(temp+ " Reverse Num = "+sum);
		//compare
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p = new Palindrome();
		p.palindrome(454);
	}

}

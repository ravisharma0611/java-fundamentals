package com.fundamental;

public class PrimeNumber {
	
	public void prime(int number) {
		
		int half = number/2;
		boolean flag = true;
		
		if(number == 0 || number ==1) {
			System.out.println("Number is not a prime number");
		}else {
			for (int i = 2; i <= Math.sqrt(half); i++) {
				if(number % i == 0) {
					System.out.println(number +" - Number is not a prime number");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(number +" - Number is prime");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p = new PrimeNumber();
		p.prime(7);
		p.prime(99991);

	}

}

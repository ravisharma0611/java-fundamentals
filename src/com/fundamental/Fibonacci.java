package com.fundamental;

public class Fibonacci {
	
	static int n1 = 0;
	static int n2 = 1;
	public void printFibo(int count) {
		
		int n3 = 0;
		
		
		
		if(count > 0) {
			n3 = n2 + n1;
			
			n1 = n2;
			n2 = n3;
			
			System.out.print(" "+n3);
			printFibo(count -1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		System.out.print(n1+" "+n2);
		int count  = 10;
		f.printFibo(count-2);

	}

}

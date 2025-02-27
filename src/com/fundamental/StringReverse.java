package com.fundamental;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new  Scanner(System.in);
		
		String str = s.nextLine();//"This is DEMO";
		s.close();
		String rev = "";
		for(int i = str.length()-1; i >= 0 ; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("String reversed: "+rev);
		
	}

}

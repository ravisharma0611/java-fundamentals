package com.threads;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m = new MyThread();
		//m.start();
		Thread t = new Thread(m);
		t.start();
	}

}

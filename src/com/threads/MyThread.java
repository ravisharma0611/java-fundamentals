package com.threads;

public class MyThread extends Thread {

	private void runInThread() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	@Override
	public void run() {
		this.runInThread();
	}
}

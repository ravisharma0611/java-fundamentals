package com.threads;

class MyRunnable implements Runnable {
    private int threadNumber;

    public MyRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + threadNumber + ": " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}

public class ThreadLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            System.out.println(thread.getThreadGroup());
            thread.start();
        }
    }
}
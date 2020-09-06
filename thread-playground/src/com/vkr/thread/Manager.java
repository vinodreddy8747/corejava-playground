package com.vkr.thread;

class A extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}
}
public class Manager {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			A a1 = new A();
			a1.start();
		}
	
	}

}

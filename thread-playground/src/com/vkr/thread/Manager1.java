package com.vkr.thread;
//diff btw Thread and Runnable
// extends
// default features
class B implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	}
}
public class Manager1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t1 = new Thread(new B());
			t1.start();
		}
	
	}

}

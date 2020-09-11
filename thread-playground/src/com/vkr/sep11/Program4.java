package com.vkr.sep11;

class D extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " is running now!");
		}
	}
}

public class Program4 {

	public static void main(String[] args) {
		D d1 = new D();
		d1.start();
		
		Thread.yield();
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " is running now!");
		}
	}

}

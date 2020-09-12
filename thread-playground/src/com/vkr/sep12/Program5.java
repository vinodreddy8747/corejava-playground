package com.vkr.sep12;

//The purpose of start() is to create a separate call stack for the thread.
//A separate call stack is created by it, and then run() is called by JVM.
class Thread3 extends Thread{
	@Override
	public void run() {
			System.out.println(Thread.currentThread().getName()  + " is running");
	}
}

public class Program5 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread3 t3 = new Thread3();
			t3.run();
		}
	}

}

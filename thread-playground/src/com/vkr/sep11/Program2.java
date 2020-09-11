package com.vkr.sep11;


class A extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("i value = "+ i);
		}
		
	}
}

class B extends Thread{
	@Override
	public void run() {
		for (int i = 100; i < 200; i++) {
			System.out.println("i value = "+ i);
		}
		
	}
}
public class Program2 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
	}
}

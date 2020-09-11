package com.vkr.sep11;

public class Program5 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Program5()); 
		  
        t.start(); 
  
        Thread t2 = new Thread(new Program5()); 
  
        t2.start(); 

	}

}

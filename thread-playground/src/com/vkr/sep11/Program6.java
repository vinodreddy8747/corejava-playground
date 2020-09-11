package com.vkr.sep11;

public class Program6 implements Runnable {

	public void run() 
    { 
        Thread t = Thread.currentThread(); 
     
        System.out.println(t.getName() + " is alive = " + t.isAlive());

        for (int i = 0; i < 10; i++) {
     			System.out.println(Thread.currentThread().getName());
     		}
    } 
  
    public static void main(String args[]) throws Exception 
    { 
        Thread t = new Thread(new Program6()); 
        t.start(); 
  
        t.join(1000); 
        
        System.out.println(t.getName() + " is alive = " + t.isAlive());
        
        for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
 
  
        System.out.println(Thread.currentThread().getName() + " is alive = " + Thread.currentThread().isAlive()); 
    }

}

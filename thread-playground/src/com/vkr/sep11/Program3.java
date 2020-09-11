package com.vkr.sep11;
class C extends Thread{
	@Override
	public void run() {
		 // moving thread2 to timed waiting state 
        try
        { 
            Thread.sleep(1500); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
		System.out.println(Thread.currentThread().getState());
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}
}

public class Program3 {

	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.getState());

		c1.start();
		System.out.println(c1.getState());
		
		try {
			Thread.sleep(200);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c1.getState());
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}

	}

}

package com.vkr.sep12;

class Sender1 
{ 
    public void send(String msg) 
    { 
        System.out.println(Thread.currentThread().getName() +" Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String[] msg; 
    Sender1  sender; 
  
    ThreadedSend(String[] m,  Sender1 obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    { 
        // Only one thread can send a message 
        // at a time. 
        synchronized(sender) 
        { 
        	System.out.println("Name of thread = " + Thread.currentThread().getName());
            // synchronizing the snd object 
        	for (String m : msg) {
                sender.send(m); 
			}
        } 
    } 
} 

public class Program2 {
	public static void main(String args[]) 
    { 
        Sender1 snd = new Sender1(); 
        String[] arr1 = {"Hi", "How are you?", "where are you?"};
        String arr2[] = {"Hey", "I am good. How about you?", "I am in bangalore"}; 
        ThreadedSend S1 = 
            new ThreadedSend( arr1 , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( arr2 , snd ); 
  
        S1.start(); 
        S2.start(); 
  
        try
        { 
           S1.join(); 
           S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
        System.out.println("End of main thread");
    } 

}


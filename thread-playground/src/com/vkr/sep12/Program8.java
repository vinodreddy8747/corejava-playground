package com.vkr.sep12;

/*
 * Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.
 * 
 * Properties:

They can not prevent the JVM from exiting when all the user threads finish their execution.
JVM terminates itself when all user threads finish their execution
If JVM finds running daemon thread, it terminates the thread and after that shutdown itself. 
JVM does not care whether Daemon thread is running or not.
It is an utmost low priority thread.

 */
public class Program8 extends Thread{
	public Program8(String name){ 
        super(name); 
    } 
  
    public void run() 
    {  
        // Checking whether the thread is Daemon or not 
        if(Thread.currentThread().isDaemon()) 
        {  
            System.out.println(getName() + " is Daemon thread");  
        }  
          
        else
        {  
            System.out.println(getName() + " is User thread");  
        }  
    }  
      
    public static void main(String[] args) 
    {  
      
    	Program8 t1 = new Program8("t1"); 
    	Program8 t2 = new Program8("t2"); 
    	Program8 t3 = new Program8("t3"); 
      
        // Setting user thread t1 to Daemon 
        t1.setDaemon(true); 
              
        // starting first 2 threads  
        t1.start();  
        t2.start(); 
  
        // Setting user thread t3 to Daemon 
        t3.setDaemon(true);  
        t3.start();         
    } 
}

package com.vkr.sep12;

/*
 * A process in operating systems uses different resources and uses resources in following way.
1) Requests a resource
2) Use the resource
2) Releases the resource

Deadlock is a situation where a set of processes are blocked 
because each process is holding a resource and waiting 
for another resource acquired by some other process.
 * 
 */
class ThreadUtil 
{ 
    static void sleep(long millis) 
    { 
        try
        { 
            Thread.sleep(millis); 
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 
  
class Shared 
{ 
    // first synchronized method 
    synchronized void test1(Shared s2) 
    { 
        System.out.println("test1-begin"); 
        ThreadUtil.sleep(1000); 
  
        // taking object lock of s2 enters 
        // into test2 method 
        s2.test2(); 
        System.out.println("test1-end"); 
    } 
  
    // second synchronized method 
    synchronized void test2() 
    { 
        System.out.println("test2-begin"); 
        ThreadUtil.sleep(1000); 
        // taking object lock of s1 enters 
        // into test1 method 
        System.out.println("test2-end"); 
    } 
} 
  
  
class Thread1 extends Thread 
{ 
    private Shared s1; 
    private Shared s2; 
    public Thread1(Shared s1, Shared s2) 
    { 
        this.s1 = s1; 
        this.s2 = s2; 
    } 
  
    @Override
    public void run() 
    { 
        // taking object lock of s1 enters 
        // into test1 method 
        s1.test1(s2); 
    } 
} 
  
  
class Thread2 extends Thread 
{ 
    private Shared s1; 
    private Shared s2; 
  
    public Thread2(Shared s1, Shared s2) 
    { 
        this.s1 = s1; 
        this.s2 = s2; 
    } 
  
    @Override
    public void run() 
    { 
        // taking object lock of s2 
        // enters into test1 method 
        s2.test1(s1); 
    } 
} 
  
  
public class Program7 
{ 
    public static void main(String[] args) 
    { 
        Shared s1 = new Shared(); 
  
        Shared s2 = new Shared(); 
  
        Thread1 t1 = new Thread1(s1, s2); 
        t1.start(); 
  
        Thread2 t2 = new Thread2(s1, s2); 
        t2.start(); 
  
        // sleeping main thread 
        ThreadUtil.sleep(2000); 
    } 
} 

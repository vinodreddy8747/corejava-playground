
Multithreading in Java
=============================

Multithreading is a Java feature that allows concurrent execution of two or more parts of 
a program for maximum utilization of CPU. Each part of such program is called a thread. 
So, threads are light-weight processes within a process.

Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface

 
Thread creation by extending the Thread class
----------------------------------------------------------
We create a class that extends the java.lang.Thread class. 
This class overrides the run() method available in the Thread class.
 A thread begins its life inside run() method. 
 We create an object of our new class and call start() method to start the execution of a thread. 
Start() invokes the run() method on the Thread object.

Thread creation by implementing the Runnable Interface
-----------------------------------------------------------
We create a new class which implements java.lang.Runnable interface and override run() method. 
Then we instantiate a Thread object and call start() method on this object.

Thread Class vs Runnable Interface
-------------------------------------------------------------
1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t 
support multiple inheritance. 
But, if we implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread by extending Thread class because it provides some 
inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.

THREAD LIFECYCLE
========================

A thread in Java at any point of time exists in any one of the following states. 
A thread lies only in one of the shown states at any instant:

New
Runnable
Blocked
Waiting
Timed Waiting
Terminated


MAIN Thread
=============

Java provides built-in support for multithreaded programming. 
A multi-threaded program contains two or more parts that can run concurrently. 
Each part of such a program is called a thread, and each thread defines a separate path of execution.

Main Thread

When a Java program starts up, one thread begins running immediately. 
This is usually called the main thread of our program, 
because it is the one that is executed when our program begins.

Properties :

It is the thread from which other “child” threads will be spawned.
Often, it must be the last thread to finish execution because it performs various shutdown actions



Relation between the main() method and main thread in Java

For each program, a Main thread is created by JVM(Java Virtual Machine). 
The “Main” thread first verifies the existence of the main() method, 
and then it initializes the class. Note that from JDK 6,
 main() method is mandatory in a standalone java application.

Deadlocking with use of Main Thread(only single thread)

We can create a deadlock by just using Main thread, i.e. by just using a single thread.
 The following java program demonstrate this.
 
 Explanation :
The statement “Thread.currentThread().join()”, will tell Main thread to wait for this thread
(i.e. wait for itself) to die.
 Thus Main thread wait for itself to die, which is nothing but a deadlock.
 
 
 METHODS TO PREVENT THREAD EXECUTION
 
 Java Concurrency – yield(), sleep() and join() methods
 
 We can prevent the execution of a thread by using one of the following methods of Thread class.

yield(): Suppose there are three threads t1, t2, and t3. 
Thread t1 gets the processor and starts its execution and thread t2 and t3 are in Ready/Runnable state. 
Completion time for thread t1 is 5 hour and completion time for t2 is 5 minutes. 
Since t1 will complete its execution after 5 hours, t2 has to wait for 5 hours to just finish 5 minutes job. 
In such scenarios where one thread is taking too much time to complete its execution, 
we need a way to prevent execution of a thread in between if something important is pending. 
yeild() helps us in doing so.
yield() basically means that the thread is not doing anything particularly important and 
if any other threads or processes need to be run, they should run. 
Otherwise, the current thread will continue to run.



Use of yield method:

Whenever a thread calls java.lang.Thread.yield method, 
it gives hint to the thread scheduler that it is ready to pause its execution.
 Thread scheduler is free to ignore this hint.
If any thread executes yield method , thread scheduler checks 
if there is any thread with same or high priority than this thread. 
If processor finds any thread with higher or same priority then it will move 
the current thread to Ready/Runnable state and give processor to other 
thread and if not – current thread will keep executing.
Syntax:

 public static native void yield()

Output may vary in machine to machine but chances of execution of yield() 
thread first is higher than the other thread because main thread is always pausing its 
execution and giving chance to child thread(with same priority).

Note:

Once a thread has executed yield method and there are many threads with same priority is waiting for processor, 
then we can't specify which thread will get execution chance first.
The thread which executes the yield method will enter in the Runnable state from Running state.
Once a thread pauses its execution, we can't specify when it will get chance again it depends on thread scheduler.
Underlying platform must provide support for preemptive scheduling if we are using yield method.

SLEEP METHOD

sleep(): This method causes the currently executing thread to sleep for the specified number of milliseconds, 
subject to the precision and accuracy of system timers and schedulers.
Syntax:
//  sleep for the specified number of milliseconds
public static void sleep(long millis) throws InterruptedException

//sleep for the specified number of milliseconds plus nano seconds
public static void sleep(long millis, int nanos) 
                         throws InterruptedException
                         

 
 
 
 

Thread Synchronization in Java
================================
In a multithreaded environment, multiple threads might try to modify the same resource. 
If threads aren't managed properly, this will, of course, lead to consistency issues.

The wait() Method
Simply put, when we call wait() – this forces the current thread to wait until 
some other thread invokes notify() or notifyAll() on the same object.

notify() and notifyAll()
The notify() method is used for waking up threads that are waiting for an access to this object's monitor.

There are two ways of notifying waiting threads.



What is Polling and what are problems with it?
======================================================
The process of testing a condition repeatedly till it becomes true is known as polling.

Polling is usually implemented with the help of loops to check whether a particular condition is true or not. 
If it is true, certain action is taken. This waste many CPU cycles and makes the implementation inefficient.
For example, in a classic queuing problem where one thread is producing data and other is consuming it.

How Java multi threading tackles this problem?
=====================================================
To avoid polling, Java uses three methods, namely, wait(), notify() and notifyAll().

All these methods belong to object class as final so that all classes have them. 
They must be used within a synchronized block only.

wait()-It tells the calling thread to give up the lock 
and go to sleep until some other thread enters the same monitor and calls notify().

notify()-It wakes up one single thread that called wait() on the same object. 
It should be noted that calling notify() does not actually give up a lock on a resource.

notifyAll()-It wakes up all the threads that called wait() on the same object.
package com.vkr.sep12;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
 * The need for Callable

There are two ways of creating threads – one by extending the 
Thread class and other by creating a thread with a Runnable. 
However, one feature lacking in  Runnable is that we cannot make a thread return result when it terminates, 
i.e. when run() completes. For supporting this feature, the Callable interface is present in Java.

Callable vs Runnable

For implementing Runnable, the run() method needs to be implemented which does not return anything, 
while for a Callable, the call() method needs to be implemented which returns a result on completion. 
Note that a thread can’t be created with a Callable, it can only be created with a Runnable.
Another difference is that the call() method can throw an exception whereas run() cannot.


public boolean cancel(boolean mayInterrupt): 
Used to stop the task. It stops the task if it has not started. 
If it has started, it interrupts the task only if mayInterrupt is true.
public Object get() throws InterruptedException, ExecutionException:
 Used to get the result of the task. If the task is complete, 
 it returns the result immediately, otherwise it waits till the task is complete and then returns the result.
public boolean isDone():
 Returns true if the task is complete and false otherwise

 */

class CallableExample implements Callable {

	public Object call() throws Exception {
		Random generator = new Random();
		Integer randomNumber = generator.nextInt(5000);

		Thread.sleep(randomNumber);

		return randomNumber;
	}

}

public class Program9 {
	public static void main(String[] args) throws Exception {

		// FutureTask is a concrete class that
		// implements both Runnable and Future
		FutureTask[] randomNumberTasks = new FutureTask[5];

		for (int i = 0; i < 5; i++) {
			Callable callable = new CallableExample();

			// Create the FutureTask with Callable
			randomNumberTasks[i] = new FutureTask(callable);

			// As it implements Runnable, create Thread
			// with FutureTask
			Thread t = new Thread(randomNumberTasks[i]);
			t.start();
		}

		for (int i = 0; i < 5; i++) {
			// As it implements Future, we can call get()
			
			System.out.println(randomNumberTasks[i].get());
			System.out.println(randomNumberTasks[i].isDone());
			
			// This method blocks till the result is obtained
			// The get method can throw checked exceptions
			// like when it is interrupted. This is the reason
			// for adding the throws clause to main
		}
	}
}

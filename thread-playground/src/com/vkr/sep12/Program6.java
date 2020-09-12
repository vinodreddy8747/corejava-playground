package com.vkr.sep12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//What is ThreadPool in Java?
//
//A thread pool reuses previously created threads to execute current tasks and offers 
//a solution to the problem of thread cycle overhead and resource thrashing. 
//Since the thread is already existing when the request arrives, 
//the delay introduced by thread creation is eliminated, making the application more responsive.
//
//
//
//
//Java provides the Executor framework which is centered around the Executor interface, 
//its sub-interface –ExecutorService and the class-ThreadPoolExecutor, which implements both of these interfaces. 
//By using the executor, one only has to implement the Runnable objects and send them to the executor to execute.
//They allow you to take advantage of threading, but focus on the tasks that you want the thread to perform, 
//instead of thread mechanics.
//To use thread pools, we first create a object of ExecutorService and pass a set of tasks to it. 
//ThreadPoolExecutor class allows to set the core and maximum pool size.
//The runnables that are run by a particular thread are executed sequentially.


class Task implements Runnable {
	private String name;

	public Task(String s) {
		name = s;
	}

	// Prints task name and sleeps for 1s
	// This Whole process is repeated 5 times
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				if (i == 0) {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for" + " task name - " + name + " = " + ft.format(d));
					// prints the initialization time for every task
				} else {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for task name - " + name + " = " + ft.format(d));
					// prints the execution time for every task
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " complete");
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Program6 {
	static final int MAX_T = 3;

	public static void main(String[] args) {
		// creates five tasks
		Runnable r1 = new Task("task 1");
		Runnable r2 = new Task("task 2");
		Runnable r3 = new Task("task 3");
		Runnable r4 = new Task("task 4");
		Runnable r5 = new Task("task 5");

		// creates a thread pool with MAX_T no. of
		// threads as the fixed pool size(Step 2)
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

		// passes the Task objects to the pool to execute (Step 3)
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);

		// pool shutdown ( Step 4)
		pool.shutdown();
	}

}

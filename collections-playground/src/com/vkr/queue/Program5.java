package com.vkr.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

//It is used to implement Queue with the help of LinkedList concurrently.
public class Program5 {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();

		clq.add(12);
		clq.add(70);
		clq.add(1009);
		clq.add(475);

		System.out.println("ConcurrentLinkedQueue: " + clq);

		ConcurrentLinkedQueue<Integer> clq1 = new ConcurrentLinkedQueue<Integer>(clq);

		System.out.println("ConcurrentLinkedQueue1: " + clq1);

		System.out.println("First Element is: " + clq.peek());

		System.out.println("Head Element is: " + clq.poll());

		System.out.println("ConcurrentLinkedQueue: " + clq);

		System.out.println("Size: " + clq.size());
	}

}

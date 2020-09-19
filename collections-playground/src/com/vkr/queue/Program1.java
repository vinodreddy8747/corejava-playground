package com.vkr.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program1 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("abc");
		queue.add("xyz");
		queue.add("pqr");
		
		System.out.println(queue);
		
		queue.remove();
		
		queue.add("123");
		System.out.println(queue);
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.contains("xyz"));
		
		
		System.out.println(queue.peek());
		
		System.out.println("Reading all elements of queue");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

/*
 * 
 * Queue is from java.util package and sub Interface of Collection Interface
 * 
 * Queue elements processed in FIFO.
 * 
 * ordered list, Adding elements at end of list and removinf elements at begining of list
 * 
 * PriorityQueue
 * LinkedList
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

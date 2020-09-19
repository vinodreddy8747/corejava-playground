package com.vkr.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Program2 {

	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(100);
		priorityQueue.add(150);
		priorityQueue.add(20);
		priorityQueue.add(30);
		priorityQueue.add(40);
		
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.peek());
		
		System.out.println("===== LinkedList ===========");
		
		Queue<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(15);
		linkedList.add(30);
		linkedList.add(40);
		
		System.out.println(linkedList.peek());
		System.out.println(linkedList.poll());
		System.out.println(linkedList.peek());
		
		System.out.println("===== PriorityBlockingQueue ===========");
		
		Queue<Integer> pbQueue = new PriorityBlockingQueue<>();
		pbQueue.add(10);
		pbQueue.add(20);
		pbQueue.add(15);
		pbQueue.add(30);
		pbQueue.add(40);
		
		System.out.println(pbQueue.peek());
		System.out.println(pbQueue.poll());
		System.out.println(pbQueue.peek());
		
		Queue<String> priorityQueue1 = new PriorityQueue<>();
		priorityQueue1.add("abc");
		priorityQueue1.add("xyz");
		priorityQueue1.add("pqr");
		priorityQueue1.add("rst");
		priorityQueue1.add("123");
		
		System.out.println(priorityQueue1.peek());
		System.out.println(priorityQueue1.poll());
		System.out.println(priorityQueue1.peek());
		
		
	}

}

//queue follows First-In-First-Out algorithm, 
//but sometimes the elements of the queue are needed to be processed according to the priority, 
//that’s when the PriorityQueue comes into play

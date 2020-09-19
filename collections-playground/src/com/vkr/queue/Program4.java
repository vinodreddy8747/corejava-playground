package com.vkr.queue;

import java.util.concurrent.ArrayBlockingQueue;

// ArrayBlockingQueue class is a bounded blocking queue backed by an array. 
//Size of array is fixed, we can not add elements if the array is full.
public class Program4 {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> abQueue = new ArrayBlockingQueue<>(3);
		
		abQueue.add(12);
		abQueue.add(13);
		abQueue.add(14);
		
		System.out.println(abQueue);
	}

}

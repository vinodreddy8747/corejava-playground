package com.vkr.queue;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Program3 {

	public static void main(String[] args) {
		AbstractQueue<Integer> AQ = new LinkedBlockingQueue<Integer>();

		AQ.add(10);
		AQ.add(20);
		AQ.add(30);
		AQ.add(40);
		AQ.add(50);

		System.out.println("AbstractQueue contains: " + AQ);

		System.out.println("Head: " + AQ.element());
		
		for (Integer integer : AQ) {
			System.out.println(integer);
		}

		AQ.clear();
		System.out.println("AbstractQueue: " + AQ);
	}

}

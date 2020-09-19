package com.vkr.queue;

import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

//LinkedBlockingQueue is an optionally-bounded blocking queue based on linked nodes. 
//It means that the LinkedBlockingQueue can be bounded, 
//if its capacity is given, else the LinkedBlockingQueue will be unbounded
public class Program6 {
	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>();

		lbq.add(1);
		lbq.add(2);
		lbq.add(3);
		lbq.add(4);
		lbq.add(5);
		System.out.println("LinkedBlockingQueue:" + lbq);

		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);

		LinkedBlockingQueue<Integer> lbq1 = new LinkedBlockingQueue<Integer>(v);
		System.out.println(lbq1);
	}
}

package com.vkr.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("hi");
		list.add("abc");
		list.add("xyz");
		
		Iterator<String> itr = list.iterator();
		System.out.println("Reading elements in forward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<String> listItr = list.listIterator();
		
		System.out.println("Reading elements in forward direction using ListIterator");

		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("Reading elements in backward direction using ListIterator");

		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}

}

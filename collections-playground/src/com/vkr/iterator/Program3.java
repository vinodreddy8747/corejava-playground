package com.vkr.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program3 {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(123);
		list.add(456);
		list.add("abc");
		list.add("pqr");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list);
		
		System.out.println("Reading elements using list iterator");
		ListIterator listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
			if(listItr.nextIndex() == 1) {
				listItr.set("hello");
				listItr.add(123456);
			}
		}
		System.out.println(list);
	}

}

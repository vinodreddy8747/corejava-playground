package com.vkr.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("hello");
		set.add("hi");
		set.add("abc");
		set.add("xyz");
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> list = new LinkedList<>();
		list.add("hello");
		list.add("hi");
		list.add("abc");
		list.add("xyz");
		
		ListIterator litr = list.listIterator();
		while(litr.hasNext()) {
			System.out.println("Prev Index= "+ litr.previousIndex() + " Index= " + litr.nextIndex() + " value =" +litr.next());
		}
		
	}

}

package com.vkr.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program4 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("India");
		set1.add("Andhra");
		set1.add("Chittoor");
		
		System.out.println(set1);
		
		set1.add("India");
		
		Iterator<String > itr = set1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}

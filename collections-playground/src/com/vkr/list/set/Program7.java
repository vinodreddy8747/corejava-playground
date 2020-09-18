package com.vkr.list.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program7 {

	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<>();

		set1.add("xyz");
		set1.add("abc");
		set1.add("123");
		set1.add("456");
		
		System.out.println(set1);
		
		Set<String> set = new HashSet<>();

		set.add("xyz");
		set.add("abc");
		set.add("123");
		set.add("456");
		
		System.out.println(set);
		
		Set<String> set2 = new LinkedHashSet<>();

		set2.add("xyz");
		set2.add("abc");
		set2.add("123");
		set2.add("456");
		
		System.out.println(set2);
		
	}

}


/*
 * 
 * Internal Working
 * When To Use
 * Order
 * Performance
 * Compare
 * Null Elements
 * 
 */

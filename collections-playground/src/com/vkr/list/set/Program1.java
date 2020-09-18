package com.vkr.list.set;

import java.util.HashSet;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		set.add("abc");
		set.add("xyz");
		set.add(123);
		set.add("1234");
		set.add(null);
		
		System.out.println(set);
	}

}
/*
 * 
 * Set Interface
 * 
 * java.util
 * 
 * extends Collection I
 * 
 * unordered collection
 * 
 * duplicate values cannot be stored
 * 
 * 2 I which extends Set -> SortedSet <- NavigableSet <- , sub class to this is
 * TreeSet
 * 
 * Since set doesn't retain the insertion order, the navigable set provides the
 * navigate through the set.
 * 
 * 
 * Operations on set interface
 * 
 * Allows to do basic mathematical operations
 * 
 * interaction
 * union
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
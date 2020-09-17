package com.vkr.list.sub;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

/**
 * 
 * 
 * The AbstractSequentialList class in Java is a part of the Java Collection
 * Framework and implements the Collection interface and the AbstractCollection
 * class. It is used to implement an unmodifiable list, for which one needs to
 * only extend this AbstractList Class and implement only the get() and the
 * size() methods.
 *
 */
public class Program2 {

	public static void main(String[] args) {
		// Creating an empty AbstractSequentialList
		AbstractSequentialList<String> absqlist = new LinkedList<String>();

		// Using add() method to
		// add elements in the list
		absqlist.add("abc");
		absqlist.add("for");
		absqlist.add("xyz");
		absqlist.add("10");
		absqlist.add("20");

		// Output the list
		System.out.println("AbstractSequentialList: " + absqlist);

		// Remove the head using remove()
		absqlist.remove(3);

		// Print the final list
		System.out.println("Final List: " + absqlist);

		// Fetching the specific
		// element from the list
		// using get() method
		System.out.println("The element is: " + absqlist.get(2));
	}

}

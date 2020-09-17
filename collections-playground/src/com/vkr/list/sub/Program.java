package com.vkr.list.sub;

import java.util.AbstractList;
import java.util.ArrayList;

//public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
//AbstractList is an abstract class, 
//so it should be assigned an instance of its subclasses such as ArrayList, LinkedList, or Vector. 
public class Program {

	public static void main(String[] args) {
		// Creating an empty AbstractList
		AbstractList<String> list = new ArrayList<String>();

		// Use add() method to add elements in the list
		list.add("abc");
		list.add("for");
		list.add("xyz");
		list.add("10");
		list.add("20");

		// Displaying the AbstractList
		System.out.println("AbstractList:" + list);
		
		 // Remove the head using remove() 
        list.remove(3); 
 
        // Print the final list 
        System.out.println("Final AbstractList: " + list); 
 
        // getting the index of last occurence 
        // using lastIndexOf() method 
        int lastindex = list.lastIndexOf("A"); 
 
        // printing the Index 
        System.out.println("Last index of A : "
                        + lastindex); 
	}

}

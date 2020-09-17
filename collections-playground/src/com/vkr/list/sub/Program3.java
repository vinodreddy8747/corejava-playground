package com.vkr.list.sub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * Immutable List
 * 
 * -> Once create list we can not change values of list, we can only read the
 * data of list. -> if we try to add elements we get error -
 * UnsupportedOperationException -> We can not add null to IMList -> If we try
 * to add null we get NullPointerException Advantages 1). They are thread safe.
 * 2). They are memory efficient.
 *
 *
 * java.lang.Object ↳ java.util.AbstractCollection ↳
 * com.google.common.collect.ImmutableCollection ↳
 * com.google.common.collect.ImmutableList
 */
public class Program3 {

	// Function to create ImmutableList from List
	public static <T> ImmutableList<T> iList(List<T> list) {
		// Create ImmutableMap from Map using copyOf()
		ImmutableList<T> immutableList = ImmutableList.copyOf(list);

		// Print the ImmutableMap
		//System.out.println(immutableList);
		return immutableList;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");

		// Create ImmutableList from List using copyOf()
		List<String> iList = Collections.unmodifiableList(list);
		ImmutableList immutableList = iList(list);

		// We change List and the changes reflect in iList.
		list.add("For");
		list.add("everyone");

		System.out.println(iList);
		System.out.println(immutableList);
		
		// Create ImmutableList using of() 
        ImmutableList<String> immutableList1 =  
               ImmutableList.of("abc", "123", "xyz"); 
        
        System.out.println(immutableList1);
		
	}
}

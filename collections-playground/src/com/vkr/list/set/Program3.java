package com.vkr.list.set;

import java.util.HashSet;
import java.util.Set;

public class Program3 {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add(123);
		set.add("abc");
		set.add("xyz");
		set.add("pqr");
		
		System.out.println(set);
		System.out.println(set.contains("abc"));
		System.out.println(set.contains("123"));
		
		set.remove(123);
		System.out.println(set);
		
		System.out.println("---------------");
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		System.out.println("Creating new Set");
		
		Set<String> set1 = new HashSet<String>();
		set1.add("India");
		set1.add("Andhra");
		set1.add("Chittoor");
		
		System.out.println(set1);
		
		set1.add("India");
		
		System.out.println(set1);
		
	}

}

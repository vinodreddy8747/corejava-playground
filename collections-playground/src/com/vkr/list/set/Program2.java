package com.vkr.list.set;

import java.util.HashSet;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		
		Set set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(3);
		set1.add(2);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);

		
		
		Set set2 = new HashSet<>();
		set2.add(10);
		set2.add(3);
		set2.add(9);
		
		System.out.println(set1);
		System.out.println(set2);
		
		//Union all
		Set unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		System.out.println(unionSet);
		
		Set intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);
		System.out.println(intersectionSet);
		
		Set difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
		
		
		
	}

}

package com.vkr.list.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program6 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();

		set.add("abc");
		set.add("xyz");
		set.add("123");
		set.add("456");

		System.out.println(set);

		Set<String> set1 = new HashSet<>();

		set1.add("abc");
		set1.add("xyz");
		set1.add("123");
		set1.add("456");

		System.out.println(set1);
	}

}

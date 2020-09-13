package com.vkr.list;

import java.util.ArrayList;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		al.add("Hello");
		al.add("All");
		al.add(1, "to");

		System.out.println("Initial ArrayList " + al);

		al.remove(1);

		System.out.println("After the Index Removal " + al);

		al.remove("hello");

		System.out.println("After the Object Removal " + al);
	}

}

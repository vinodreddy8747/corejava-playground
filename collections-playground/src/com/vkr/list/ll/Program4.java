package com.vkr.list.ll;

import java.util.LinkedList;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		List<String> al = new LinkedList();

		al.add("Hello");
		al.add("All");
		al.add(1, "to");

		System.out.println("Initial LinkedList " + al);

		al.remove(1);

		System.out.println("After the Index Removal " + al);

		al.remove("hello");

		System.out.println("After the Object Removal " + al);
	}

}

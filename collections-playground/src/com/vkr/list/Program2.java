package com.vkr.list;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		al.add("hello");
		al.add("all");
		al.add(1, "to");

		System.out.println(al);
	}

}

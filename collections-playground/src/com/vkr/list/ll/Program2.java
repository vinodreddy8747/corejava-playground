package com.vkr.list.ll;

import java.util.LinkedList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<String> al = new LinkedList<>();

		al.add("hello");
		al.add("all");
		al.add(1, "to");

		System.out.println(al);
	}

}

package com.vkr.list;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<>();

		al.add("Hello");
		al.add("everyone");
		al.add(1, "to");

		System.out.println("Initial ArrayList " + al);

		al.set(1, "For");

		System.out.println("Updated ArrayList " + al);

	}

}

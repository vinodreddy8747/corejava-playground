package com.vkr.list;

import java.util.ArrayList;
import java.util.List;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<>();

		al.add("hello");
		al.add("everyone");
		al.add(1, "to");

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		// Using the for each loop
		for (String str : al)
			System.out.print(str + " ");

	}

}

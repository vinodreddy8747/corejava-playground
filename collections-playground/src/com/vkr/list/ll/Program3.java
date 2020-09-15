package com.vkr.list.ll;

import java.util.LinkedList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new LinkedList();

		al.add("Hello");
		al.add("everyone");
		al.add(1, "to");

		System.out.println("Initial LinkedList " + al);

		al.set(1, "For");

		System.out.println("Updated LinkedList " + al);

	}

}

package com.vkr.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Program5 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "hello");
		map.put(2, "to");
		map.put(3, "all");
		map.put(4, "Computer");
		map.put(5, "Portal");

		Map<Integer, String> imap = Collections.unmodifiableMap(map);

		System.out.println(imap);
	}

}

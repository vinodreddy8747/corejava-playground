package com.vkr.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program2 {

	public static void main(String[] args) {
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("xyz", 2000);
		hashMap.put("abc", 1000);
		hashMap.put("pqr", 500);

		System.out.println(hashMap);

		Map<String, Object> linkedhashMap = new LinkedHashMap<>();
		linkedhashMap.put("xyz", 2000);
		linkedhashMap.put("abc", 1000);
		linkedhashMap.put("pqr", 500);

		System.out.println(linkedhashMap);

		Map<String, Object> treeMap = new TreeMap<>();
		treeMap.put("xyz", 2000);
		treeMap.put("abc", 1000);
		treeMap.put("pqr", 500);

		System.out.println(treeMap);

	}

}

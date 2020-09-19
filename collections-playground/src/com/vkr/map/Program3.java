package com.vkr.map;

import java.util.EnumMap;

public class Program3 {

	enum Color {
		RED, GREEN, BLUE, WHITE
	}

	public static void main(String[] args) {
		EnumMap<Color, Integer> colors1 = new EnumMap<>(Color.class);

		colors1.put(Color.RED, 1);
		colors1.put(Color.GREEN, 2);

		System.out.println("EnumMap colors1: " + colors1);

		EnumMap<Color, Integer> colors2 = new EnumMap<>(Color.class);

		colors2.putAll(colors1);
		colors2.put(Color.BLUE, 3);

		System.out.println("EnumMap colors2: " + colors2);

		System.out.println("Reading elements from map");
		System.out.println("Key/Value mappings: " + colors2.entrySet());

		System.out.println("Keys: " + colors2.keySet());

		System.out.println("Values: " + colors2.values());

		System.out.println("Value of RED : " + colors2.get(Color.RED));

		System.out.println("Removing elements from map");

		int value = colors2.remove(Color.GREEN);
		System.out.println("Removed Value: " + value);

		boolean result = colors2.remove(Color.RED, 1);
		System.out.println("Is the entry {RED=1} removed? " + result);

		// print the updated map to the console
		System.out.println("Updated EnumMap: " + colors2);

		System.out.println("Replace the map elements");

		colors2.put(Color.RED, 1);
		colors2.put(Color.GREEN, 2);
		colors2.put(Color.BLUE, 3);
		colors2.put(Color.WHITE, 4);
		System.out.println("EnumMap colors " + colors2);

		colors2.replace(Color.RED, 11);
		colors2.replace(Color.GREEN, 2, 12);
		System.out.println("EnumMap using replace(): " + colors2);

		colors2.replaceAll((key, oldValue) -> oldValue + 3);
		System.out.println("EnumMap using replaceAll(): " + colors2);
	}

}

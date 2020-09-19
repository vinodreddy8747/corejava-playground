package com.vkr.map;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		// Traversing through the map
		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}

}

/***
 * Map I/F present in java.util pkg Map is not subtype of Collection I/F Map
 * represents mapping between kay and value Map contains unique key
 * 
 * We can see how to add the elements
 * change elements
 * read the elements
 * remove the elements
 * 
 * 
 * Characteristics
 * 
 * 1. Map key should be unique, won't allow duplicate keys. It allow only one null key.
 * 2. HM, LHM allow duplicate key but TM won't allow dupicate key
 * 3. order of map elements unorder for HM, have sequential order for LHM, soring order for TM
 * 
 * 
 * Why and when to use map?
 * 
 * If we have a requirement of maintain data using key value pair use map.
 * 
 * Map of zipcodes and cities
 * map of managers and employees
 * map of class and students
 * map of error codes and description
 * 
 */

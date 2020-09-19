package com.vkr.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Program6 {

	public static void main(String[] args) {
		// ----------hashtable -------------------------
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, " ajay");
		ht.put(101, "Vijay");
		ht.put(102, "Ravi");
		ht.put(103, "Rahul");
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// ----------------hashmap--------------------------------
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(104, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println("-----------Hash map-----------");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}

/***
 * 
 * HT vs HM
 * synchronized
 * null keys
 * threadsafe
 * 
 * HM vs LHM vs TM
 * 
 * HM - no order, LHM has order, Tm has sorting order
 * contains only uniqe elements
 * HM, LHM -only one null key and multiple null values, but TM not allow null key
 *  Requirements for keys - HM,LHM equals, hashcode TM - 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

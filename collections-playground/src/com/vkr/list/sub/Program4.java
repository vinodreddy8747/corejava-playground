package com.vkr.list.sub;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// AL vs Vector
// synchronization
// performance
// data growth
// traversal
// application
public class Program4 {

	public static void main(String[] args) {
		// creating an ArrayList
		ArrayList<String> al = new ArrayList<String>();

		// adding object to arraylist
		al.add("Practice daily");
		al.add("study interview questions");
		al.add("always see what, why and where to use any new topic?");

		// traversing elements using Iterator'
		System.out.println("ArrayList elements are:");
		Iterator it = al.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		

		// creating Vector
		Vector<String> v = new Vector<String>();
		v.addElement("Practice");
		v.addElement("programs");
		v.addElement("daily");

		// traversing elements using Enumeration
		System.out.println("\nVector elements are:");
		Enumeration e = v.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}

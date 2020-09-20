package com.vkr.iterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Program4 {

	public static void main(String[] args) {
		Vector dayNames = new Vector();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");

		// Creating enumeration
		Enumeration days = dayNames.elements();

		// Retrieving elements of enumeration
		while (days.hasMoreElements())
			System.out.println(days.nextElement());
		
		System.out.println(dayNames);

		System.out.println("Reading elements using Iterator");
		Iterator itr = dayNames.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println(s1);
			if(s1.equals("Sunday")) {
				itr.remove();
			}
		}
		
		System.out.println(dayNames);
	}

}

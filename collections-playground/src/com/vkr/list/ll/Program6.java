package com.vkr.list.ll;

//The List interface provides a way to store the ordered collection. 
//It is a child interface of Collection. 
//It is an ordered collection of objects in which duplicate values can be stored. 
//Since List preserves the insertion order, 
//it allows positional access and insertion of elements.
import java.util.LinkedList;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<Integer>();

		l1.add(0, 1);

		l1.add(1, 2);
		System.out.println(l1);

		List<Integer> l2 = new LinkedList<Integer>();

		l2.add(1);
		l2.add(2);
		l2.add(3);

		l1.addAll(1, l2);
		System.out.println(l1);

		l1.remove(1);
		System.out.println(l1);

		System.out.println(l1.get(3));

		l1.set(0, 5);
		System.out.println(l1);
	}

}

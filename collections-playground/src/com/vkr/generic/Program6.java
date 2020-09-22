package com.vkr.generic;

import java.util.Arrays;
import java.util.List;

public class Program6 {

	public static void main(String[] args) {

		// Upper Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// printing the sum of elements in list
		System.out.println("Total sum is:" + sum(list1));

		// Double list
		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

		// printing the sum of elements in list
		System.out.print("Total sum is:" + sum(list2));
	}

	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}

		return sum;
	}

}

/**

The question mark (?) is known as the wildcard in generic programming . 
It represents an unknown type. 
The wildcard can be used in a variety of situations such as the type of a parameter, 
field, or local variable; sometimes as a return type

Upper Bounded Wildcards: 
These wildcards can be used when you want to relax the restrictions on a variable.
 For example, say you want to write a method that 
 works on List < integer >, List < double >, and List < number > , 
 you can do this  using an upper bounded wildcard.
 public static void add(List<? extends Number> list)
 
 Lower Bounded Wildcards: It is expressed using the wildcard character (‘?’), 
 followed by the super keyword, followed by its lower bound: <? super A>.
 Syntax: Collectiontype <? super A>





*/

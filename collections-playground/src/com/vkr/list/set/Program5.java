package com.vkr.list.set;

import java.util.EnumSet;
import java.util.Set;

enum Days{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
public class Program5 {

	public static void main(String[] args) {
		Set<Days> set = EnumSet.of(Days.MONDAY,
				Days.TUESDAY,
				Days.WEDNESDAY,
				Days.THURSDAY,
				Days.FRIDAY,
				Days.SATURDAY,
				Days.SUNDAY);
		
		System.out.println(set);
	}

}

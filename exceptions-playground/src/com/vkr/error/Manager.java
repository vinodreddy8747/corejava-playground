package com.vkr.error;

public class Manager {
	
	public static void test(int i) {
		if (i == 0)
			return;
		else {
			test(i++);
		}
	}

	public static void main(String[] args) {
		test(5);
	}

}

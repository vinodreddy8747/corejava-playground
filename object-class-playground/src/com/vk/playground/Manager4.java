package com.vk.playground;

public class Manager4 {

	String s1;
	boolean b1;

	public Manager4(String s1, boolean b1) {
		this.s1 = s1;
		this.b1 = b1;
	}

	public static void main(String[] args) {
		Manager4 m1 = new Manager4("abc", true);
		Manager4 m2 = new Manager4("abc", true);
		
		Manager4 m3 = new Manager4("xyz", true);
		
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
	}

}

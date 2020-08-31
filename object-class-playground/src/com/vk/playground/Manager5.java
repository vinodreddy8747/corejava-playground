package com.vk.playground;

public class Manager5 {

	String s1;
	boolean b1;

	public Manager5(String s1, boolean b1) {
		this.s1 = s1;
		this.b1 = b1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Manager5 m1 = (Manager5) obj;
		return this.s1.equals(m1.s1) && this.b1 == m1.b1;
	}

	public static void main(String[] args) {
		Manager5 m1 = new Manager5("abc", true);
		Manager5 m2 = new Manager5("abc", true);
		
		Manager5 m3 = new Manager5("xyz", true);
		
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
	}

}

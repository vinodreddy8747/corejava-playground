package com.vk.playground;

public class Manager2 {
	
	String s1;
	double d1;
	
	Manager2(String s1, double d1){
		this.s1 = s1;
		this.d1 = d1;
	}

	public static void main(String[] args) {
		Manager2 m1 =  new Manager2("abc", 20.0);
		Manager2 m2 =  new Manager2("abc", 20.0);
		Manager2 m3 =  new Manager2("abc", 20.0);

		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());

	}

}

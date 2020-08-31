package com.vk.playground;

public class Manager3 {
	
	String s1;
	double d1;
	
	Manager3(String s1, double d1){
		this.s1 = s1;
		this.d1 = d1;
	}
	
	public int hashCode() {
		return s1.hashCode() + Double.toString(d1).hashCode();
	}

	public static void main(String[] args) {
		Manager3 m1 =  new Manager3("abc", 20.0);
		Manager3 m2 =  new Manager3("abc", 20.0);
		Manager3 m3 =  new Manager3("abc", 20.0);

		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());

	}

}

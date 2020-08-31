package com.vk.playground;
class A{
	int i;
	String s1;
	
	A(int i, String s1){
		this.i = i;
		this.s1 = s1;
	}
	
	public int getI() {
		return i;
	}
	public String getS1() {
		return s1;
	}
	
	public String toString() {
		return "i = " + i + ", s1 = " + s1;
	}
}
public class Manager1 {

	public static void main(String[] args) {
		A a1 = new A(10, "abc");
		
		A a2 = new A(20, "xyz");
		
		System.out.println(a1);
		System.out.println(a2);
		

	}

}

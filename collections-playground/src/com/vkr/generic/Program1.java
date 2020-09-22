package com.vkr.generic;

class Test1{
	String s1;
	
	Test1(String s1){
		this.s1 = s1;
	}
}
public class Program1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1("abc");
		System.out.println(t1.s1);
	}

}

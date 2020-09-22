package com.vkr.generic;

class Test2<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Test2(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

public class Program3 {

	public static void main(String[] args) {
		Test2<String, Integer> obj = new Test2<String, Integer>("HelloAll", 15);
		obj.print();

		System.out.println("Get Test2 ( Integer, String ) ");
		Test2<Integer, String> obj1 = new Test2<Integer, String>(15, "HelloAll");
		obj1.print();

	}

}

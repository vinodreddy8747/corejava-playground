package com.vkr.generic;

class Test<T>{
	T obj;
	
	Test(T obj){
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Test [obj=" + obj + "]";
	}
	
}
public class Program2 {
	public static void main(String[] args) {
		Test<String> t1 = new Test("abc");
		
		System.out.println(t1.obj);
		
		Test<Integer> t2 = new Test(123);
		System.out.println(t2.obj);
		
		Test t3 = new Test(new Test("abcdef"));
		
		System.out.println(t3.obj);
	}
}

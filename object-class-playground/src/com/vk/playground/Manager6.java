package com.vk.playground;

public class Manager6 {
	
	Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}

	public static void main(String[] args) {
		Manager6 m1 = new Manager6();
		
		m1.setObj(new String("abc"));
		
		System.out.println(m1.getObj());
		System.out.println(m1.getObj().getClass().getName());

		
		Manager6 m2 = new Manager6();
		
		m2.setObj(new Manager1());
		
		System.out.println(m2.getObj());
		
		System.out.println(m2.getObj().getClass().getName());

	}

}

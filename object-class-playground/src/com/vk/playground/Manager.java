package com.vk.playground;

class Person{
	int id;
	String name;
	String qualification;
	
	public Person(int id, String name, String qualification) {
		this.id = id;
		this.name = name;
		this.qualification = qualification;
	}
	
//	public String toString()
//	{
//	    return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	}
	
}
public class Manager {

	public static void main(String[] args) {
		Person p =  new Person(100, "abcd", "MBA123");
		System.out.println(p.toString());
		
		Person p1 =  new Person(100, "abcd", "MBA123");
		
		System.out.println(p1);
	}

}

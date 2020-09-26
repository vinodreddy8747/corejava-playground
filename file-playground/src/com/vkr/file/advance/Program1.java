package com.vkr.file.advance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Person {
	int id;
	String name;
	int age;

	Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person[ id = " + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class Program1 {

	public static void main(String[] args) throws IOException {
		File file = new File("persons.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String str;

		List<Person> list = new ArrayList<>();

		while ((str = br.readLine()) != null) {
			String arr[] = str.split(" ");
			list.add(new Person(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])));
		}
		
		System.out.println(list);
	}

}

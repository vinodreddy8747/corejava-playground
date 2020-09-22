package com.vkr.generic;

import java.util.ArrayList;

public class Program5 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("Sachin");
		al.add("Rahul");
		al.add(10); // Compiler allows this

		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);

		// Causes Runtime Exception
		String s3 = (String) al.get(2);
		
//        ArrayList <String> al1 = new ArrayList<String> (); 
//  
//        al1.add("Sachin"); 
//        al1.add("Rahul"); 
//  
//        al1.add(10);  
//  
//        String s11 = (String)al.get(0); 
//        String s21 = (String)al.get(1); 
//        String s31 = (String)al.get(2); 
	}

}

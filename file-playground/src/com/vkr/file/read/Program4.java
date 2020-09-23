package com.vkr.file.read;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Program4 {
	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}

	public static void main(String[] args) throws Exception {
		String data = readFileAsString("test.txt");
		System.out.println(data);
	}
}

/*
 * 
 * There are several ways to read a plain text file in Java 
 * e.g. you can use FileReader, 
 * 					BufferedReader 
 * 					or Scanner to read a text file
 * 
 * Every utility provides something special
 *  e.g. BufferedReader provides buffering of data for fast reading, 
 *  and Scanner provides parsing ability.
 *  
 *  We can also use both BufferReader and Scanner to read a text file line by line in Java. 
 *  Then Java SE 8 introduces another Stream class java.util.stream.Stream which provides 
 *  a lazy and more efficient way to read a file
 *  
 *  ->Using BufferedReader
 *  -> Using FileReader class
 *  -> Using Scanner class
 *  -> Using Scanner class but without using loops
 *  -> Reading the whole file in a List
 *  -> Read a text file as String in Java
 *  
 * 
 */

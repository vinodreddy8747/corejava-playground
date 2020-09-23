package com.vkr.file.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("test.txt");

		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);

		System.out.println();
		System.out.println("=======Read using Scanner class ============");

		File file = new File("test.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		
		System.out.println();
		System.out.println("=======Read file using Scanner without using loop ============");
		 // we just need to use \\Z as delimiter 
		Scanner sc1 = new Scanner(file);
	    sc1.useDelimiter("\\Z"); 
	  
	    System.out.println(sc1.next()); 
	}

}

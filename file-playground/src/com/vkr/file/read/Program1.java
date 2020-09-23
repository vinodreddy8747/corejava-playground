package com.vkr.file.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Program1 {

	public static void main(String[] args) throws Exception {
		File file = new File("test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}

}

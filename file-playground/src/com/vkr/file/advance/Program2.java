package com.vkr.file.advance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

//Program to read each and every file of a directory and write in output.txt file
public class Program2 {

	public static void main(String[] args) throws IOException {
		File file = new File("/file-playground/files/");
		
		PrintWriter pw = new PrintWriter("output.txt");
		String[] files = file.list();
		System.out.println(Arrays.toString(files));
		for (String string : files) {
			File f = new File(file, string);
			FileReader reader = new FileReader(f);
			BufferedReader br =new BufferedReader(reader);
			
			System.out.println("Reading file content of file "+ string);
			String line = br.readLine(); 
            while (line != null) { 
  
                // write to the output file 
                pw.println(line); 
                line = br.readLine(); 
            } 
		}
		pw.flush();
	}

}

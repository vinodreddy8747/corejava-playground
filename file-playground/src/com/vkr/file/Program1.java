package com.vkr.file;

import java.io.File;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) {
		File file =new File("file.txt");
		File filenew =new File("file-new.txt");
		try {
			boolean result = file.createNewFile();
			if(result) {
				System.out.println("File "+file.getName()+" created successfully");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
	}

}

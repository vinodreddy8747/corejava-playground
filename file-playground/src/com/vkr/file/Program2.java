package com.vkr.file;

import java.io.File;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		File file =new File("/files/file.txt");
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

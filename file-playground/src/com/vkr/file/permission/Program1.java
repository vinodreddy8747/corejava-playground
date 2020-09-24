package com.vkr.file.permission;

import java.io.File;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		// creating a file instance
		File file = new File("1.txt");
		file.createNewFile();

		// check if the file exists
		boolean exists = file.exists();
		if (exists == true) {
			// printing the permissions associated with the file
			System.out.println("Executable: " + file.canExecute());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canWrite());
		} else {
			System.out.println("File not found.");
		}
	}
}

package com.vkr.file.permission;

import java.io.File;

public class Program4 {

	public static void main(String[] args) {

		File file = new File("1-modified.txt");

		if (file.renameTo(new File("newFile.txt"))) {
			// if file copied successfully then delete the original file
			file.delete();
			System.out.println("File moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}

}

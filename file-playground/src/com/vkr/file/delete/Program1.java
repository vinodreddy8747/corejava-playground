package com.vkr.file.delete;

import java.io.File;

public class Program1 {

	public static void main(String[] args) {
		File file = new File("newFile.txt");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete the file");
		}
	}

}

package com.vkr.file.advance;

import java.io.File;

public class Program3 {

	static void RecursivePrint(File[] arr, int level) {
		for (File f : arr) {
			for (int i = 0; i < level; i++)
				System.out.print("\t");

			if (f.isFile())
				System.out.println(f.getName());

			else if (f.isDirectory()) {
				System.out.println("[" + f.getName() + "]");

				RecursivePrint(f.listFiles(), level + 1);
			}
		}
	}

	public static void main(String[] args) {
		String maindirpath = "/file-playground";

		File maindir = new File(maindirpath);

		if (maindir.exists() && maindir.isDirectory()) {
			File arr[] = maindir.listFiles();

			System.out.println("**********************************************");
			System.out.println("Files from main directory : " + maindir);
			System.out.println("**********************************************");

			RecursivePrint(arr, 0);
		}
	}

}

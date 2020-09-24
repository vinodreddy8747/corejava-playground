package com.vkr.file.permission;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// moving a file from one directory to another directory
public class Program3 {

	public static void main(String[] args) throws IOException {
		Path temp = Files.move(Paths.get("1.txt"), Paths.get("1-modified.txt"));

		if (temp != null) {
			System.out.println("File renamed and moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}

}

/*
 * 
 * 
 * Using Files.Path move() method: Renaming and moving the file permanently to a
 * new location. Syntax:
 * 
 * public static Path move(Path source, Path target, CopyOption..options) throws
 * IOException Parameters: source - the path to the file to move target - the
 * path to the target file (may be associated with a different provider to the
 * source path) options - options specifying how the move should be done
 * Returns: the path to the target file
 * 
 * 
 * Using Java.io.File.renameTo() and Java.io.File.delete() methods: 
 * Copying the file and deleting the original file using these two methods.
 * 
 * Syntax of renameTo():

	public boolean renameTo(File dest)
	Description: Renames the file denoted by this abstract path name.
	Parameters: dest - The new abstract path name for the named file
	Returns: true if and only if the renaming succeeded; false otherwise
	
	public boolean delete()
	Description: Deletes the file or directory 
	denoted by this abstract path name.
	Returns: true if and only if the file or 
	directory is successfully deleted; false otherwise

 * 
 */

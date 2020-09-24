package com.vkr.file.permission;

import java.io.File;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check if file exists 
		File file = new File("1.txt");

        boolean exists = file.exists(); 
        if(exists == true) 
        { 
            // changing the file permissions 
            file.setExecutable(true); 
            file.setReadable(true); 
            file.setWritable(false); 
            System.out.println("File permissions changed."); 
  
            // printing the permissions associated with the file currently 
            System.out.println("Executable: " + file.canExecute()); 
            System.out.println("Readable: " + file.canRead()); 
            System.out.println("Writable: "+ file.canWrite()); 
              
        } 
        else
        { 
            System.out.println("File not found."); 
        } 
	}

}

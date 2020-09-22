package com.vkr.generic;

public class Program4 {
	
	// A Generic method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 
   
    // Driver method 
    public static void main(String[] args) 
    { 
         // Calling generic method with Integer argument 
        genericDisplay(11); 
   
        // Calling generic method with String argument 
        genericDisplay("HelloAll");
   
        // Calling generic method with double argument 
        genericDisplay(1.0); 
    } 

}

/**

Programs that uses Generics has got many benefits over non-generic code.
Code Reuse: We can write a method/class/interface once and use for any type we want.
Type Safety : Generics make errors to appear compile time than at run time 
(It’s always better to know problems in your 
code at compile time rather than making your code fail at run time).
3. Individual Type Casting is not needed

*/
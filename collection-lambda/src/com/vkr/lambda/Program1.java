package com.vkr.lambda;
interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x); 
  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
} 
  
class Program1 
{ 
    public static void main(String args[]) 
    { 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(2*x); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
    } 
} 

/*
Syntax:

 lambda operator -> body


    Zero parameter:

    () -> System.out.println("Zero parameter lambda");

    One parameter:–

    (p) -> System.out.println("One parameter: " + p);

    It is not mandatory to use parentheses, if the type of that variable can be inferred from the context
    Multiple parameters :

    (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);






*/
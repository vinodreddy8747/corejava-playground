Errors V/s Exceptions In Java

Error : An Error “indicates serious problems that a reasonable application should not try to catch.”
Both Errors and Exceptions are the subclasses of java.lang.Throwable class. 
Errors are the conditions which cannot get recovered by any handling techniques. 
It surely cause termination of the program abnormally. 
Errors belong to unchecked type and mostly occur at runtime. 
Some of the examples of errors are Out of memory error or a System crash error.


Exceptions : An Exception “indicates conditions that a reasonable application might want to catch.”
Exceptions are the conditions that occur at runtime and may cause the termination of program. 
But they are recoverable using try, catch and throw keywords. 
Exceptions are divided into two catagories : checked and unchecked exceptions.
 Checked exceptions like IOException known to the compiler at compile time while unchecked exceptions 
 like ArrayIndexOutOfBoundException known to the compiler at runtime. 
It is mostly caused by the program written by the programmer.


ERRORS	                                EXCEPTIONS
Recovering from Error is not possible.	We can recover from exceptions by either using try-catch block or throwing exceptions back to caller.
All errors in java are unchecked type.	Exceptions include both checked as well as unchecked type.
Errors are mostly caused by the environment in which program is running.	Program itself is responsible for causing exceptions.
Errors occur at runtime and not known to the compiler.	All exceptions occurs at runtime but checked exceptions are known to compiler while unchecked are not.
They are defined in java.lang.Error package.	They are defined in java.lang.Exception package
Examples :
java.lang.StackOverflowError, java.lang.OutOfMemoryError	Examples :
Checked Exceptions : SQLException, IOException
Unchecked Exceptions : ArrayIndexOutOfBoundException, NullPointerException, ArithmeticException.


How JVM handle an Exception?

Default Exception Handling : Whenever inside a method, 
if an exception has occurred, the method creates an Object known as Exception Object and hands it off to the run-time system(JVM).
 The exception object contains name and description of the exception, and current state of the program where exception has occurred. 
 Creating the Exception Object and handling it to the run-time system is called throwing an Exception.
 There might be the list of the methods that had been called to get to the method where exception was occurred. 
This ordered list of the methods is called Call Stack.Now the following procedure will happen.


Checked vs Unchecked Exceptions in Java

1) Checked: are the exceptions that are checked at compile time. 
If some code within a method throws a checked exception, 
then the method must either handle the exception or it must specify the exception using throws keyword.

Unchecked are the exceptions that are not checked at compiled time. 
In C++, all exceptions are unchecked, so it is not forced by the compiler to either handle or specify the exception.
 It is up to the programmers to be civilized, and specify or catch the exceptions.
In Java exceptions under Error and RuntimeException classes are unchecked exceptions, 
everything else under throwable is checked.

Hierarchy

Object
|
v
Throwable
|
v
Exception -> Checked Exceptions (IOE, compile time error), Unchecked exceptions(runtime errors, null pointer exception)
Erroir -> Virtual machine error, assertion error



How Programmer handles an exception?

Customized Exception Handling : Java exception handling is managed via five keywords: try, catch, 
		throw, throws, and finally. Briefly, here is how they work. 
		Program statements that you think can raise exceptions are contained within a try block. 
		If an exception occurs within the try block, it is thrown. 
		Your code can catch this exception (using catch block) and handle it in some rational manner. 
		System-generated exceptions are automatically thrown by the Java run-time system. 
		To manually throw an exception, use the keyword throw. 
		Any exception that is thrown out of a method must be specified as such by a throws clause. 
		Any code that absolutely must be executed after a try block completes is put in a finally block.
		
		
		
throw

The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. \
We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions.
Syntax:

throw Instance
Example:
throw new ArithmeticException("/ by zero");


Control flow in try-catch clause OR try-catch-finally clause
==================================================================
Case 1: Exception occurs in try block and handled in catch block
Case 2: Exception occurs in try-block is not handled in catch block
Case 3: Exception doesn’t occur in try-block
try-finally clause
================================================
Case 1: Exception occurs in try block
Case 2: Exception doesn’t occur in try-block



USER DEFINED EXCEPTIONS
========================

User-Defined Exceptions

Sometimes, the built-in exceptions in Java are not able to describe a certain situation. 
In such cases, user can also create exceptions which are called ‘user-defined Exceptions’.
Following steps are followed for the creation of user-defined Exception.

The user should create an exception class as a subclass of Exception class. 
Since all the exceptions are subclasses of Exception class, the user should also make his class a subclass of it. 

This is done as:
class MyException extends Exception
We can write a default constructor in his own exception class.
MyException(){}

We can also create a parameterized constructor with a string as a parameter.
We can use this to store exception details. 
We can call super class(Exception) constructor from this and send the string there.
MyException(String str)
{
   super(str);
}

To raise exception of user-defined type, 
we need to create an object to his exception class and throw it using throw clause, as:
MyException me = new MyException(“Exception details”);
throw me;

The following program illustrates how to create own exception class MyException.
Details of account numbers, customer names, and balance amounts are taken in the form of three arrays.
In main() method, the details are displayed using a for-loop. 
At this time, check is done if in any account the balance amount is 
less than the minimum balance amount to be ept in the account.
If it is so, then MyException is raised and a message is displayed “Balance amount is less”.





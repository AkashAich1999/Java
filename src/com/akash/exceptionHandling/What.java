package com.akash.exceptionHandling;

public class What {

    // There is a difference between Error and Exceptions.
    // Error is something like suppose happened because of lack of resources or something. For e.g., stackoverflow.
    // Exceptions on the other hand, it's something that prevents the normal flow of the program. E.g., Arithmetic Exceptions like dividing by 0; NullPointerException; etc.

    // Throwable class handles all the Exceptions and Errors.
    // Throwable class inherits the Object class.
    // Object --> Throwable
    // Throwable --> 1) Exceptions;  Throwable --> 2) Errors.
    // Exceptions --> 1) Checked Exceptions;  Exceptions --> 2) Un-Checked Exceptions;
    // Checked Exceptions are checked during the compile time.
    // So, if we will get an exception during the compile time, then, it will be a Checked Exception.
    // For e.g., we are trying to open a file and therefore provide a file location but the file does not exist. Then it will give a FileNotFoundException.

    // Unchecked Exceptions. Compiler will not be able to detect an unchecked exception. It will only be detected while the program is running. E.g., divide by 0 (ArithmeticException)

    // Object class --> Throwable class --> Exception class --> RuntimeException class --> ArithmeticException class.
    // finally { } block means no matter what happens, this block will always run.

    // 5 Keywords :
    // try, catch, finally, throws, throw
    // throws is used to declare exceptions. This may throw an exception.

    // If we are using more than one catch block, then more strict Exceptions. E.g., ArithmeticException should come above.
    // If we are using Exception class as a parameter, it should be the last catch block.
    // More strict Exceptions must come first (Must be above).
    // We can create only one finally block.

}

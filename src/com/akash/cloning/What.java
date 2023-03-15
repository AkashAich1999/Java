package com.akash.cloning;

public class What {
    // Object cloning means we are creating an exact copy of an object.
    // clone() is a method in the Object class that can be used to make this copies.
    // In java.lang package, there is an interface called clonable. So, we must implement that by the class whose clone we want to create.

    // One important Qs (One important point), we may ask :
    // public interface Clonable {} does not have any abstract class, then why are we implementing this, the reason for that is, it is a way to tell the JVM (Java Virtual Machine), just perform clone on the object of type Human class.

    // In Shallow copy, for primitive, it will be copied as it is.
    // In Shallow copy, for non-primitive, if we are creating an object, and the object itself contains an object of different reference type, then, it will reference to the same previous memory location only, but that inner object's type value will not be copied.
    // Deep Copy, will solve the problem, by creating separate copies of the inner objects(e.g., array objects), present as an element of the object of a class.
}

package com.akash.staticExample;

public class StaticMethod {
    public static void main(String[] args) {
        // A static method can access only static data and not instance's data.
        StaticMethod.fun();
    }

    // It is not dependent on objects (instance)
    static void fun(){
//        greeting();
//        StaticMethod.greeting();
        // We can't use the above 2 local methods because it requires an instance but the function is static & does not depend on objects.

        //  We can't access non-static stuff without referencing their instances in a static context.
        StaticMethod obj = new StaticMethod();
        obj.greeting();
    }

    // We know that something which is not static belongs to an instance (object).
    void greeting(){
//        fun();         // It is possible.
        System.out.println("Hello World !!");
    }
}

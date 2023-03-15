package com.akash.introduction;

public class FinalKeyword {

    public static void main(String[] args) {

        // As we can't modify the final variable, so always initialize while Declaraing. It applies for only primitive datatype.
        final int N = 2;
//        n = 4;         // Value cannot be modified in case of primitive datatype.
        System.out.println(N);
        System.out.println();

        // Incase of non-primitive datatype, object's value can be modified but the reference to the object cannot be modified.
        final Student mukta = new Student();
        mukta.name = "Maa";            // Object's value can be changed;
//        mukta = new Student();         // Refernce cannot be modified
        System.out.println(mukta.name);
    }
}

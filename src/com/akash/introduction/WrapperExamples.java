package com.akash.introduction;

public class WrapperExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Java works for pass by value only for primitive.

        Integer num = new Integer(57);

        Integer n = 37;

        // It will not give the required output.
        swap(a, b);

        System.out.println(a + " " + b);

        Integer a1 = 10;
        Integer a2 = 20;
        swap(a1, a2);
        System.out.println(a1 + " " + a2);
    }
//    static void swap(int a, int b){
//        // Here, parameter a and b are local variables and not the referenced object. So, the original a and b does not get swapped.
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    static void swap(Integer a, Integer b){
        // Here, parameter a and b are local variables and not the referenced object. So, the original a and b does not get swapped.
        // Still it does not work because Integer is final.
        Integer temp = a;
        a = b;
        b = temp;
    }
}

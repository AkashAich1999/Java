package com.akash.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Store 5 Roll No.s
        int[] numbers = new int[5];
//        System.out.println(numbers);

        // Store 5 Names
        String[] names = new String[5];

        // Data of 5 Students : {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

//        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));

        Student akash;
        akash = new Student();

        // Printing the default values.
        System.out.println(akash.rno);
        System.out.println(akash.name);
        System.out.println(akash.marks);
    }
}

class Student {
//    int[] rno = new int[5];
//    String[] name = new String[5];
//    float[] marks = new float[5];

//    int rno;
//    String name;
//    float marks;

    int rno = 57;
    String name = "Akash Aich";
    float marks = 7.6f;

}
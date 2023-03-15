package com.akash.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student akash = new Student(57, 76.0f);
        Student harsh = new Student(84, 80.0f);
        Student harmik = new Student(40, 72.0f);
        Student darshit = new Student(39, 88.0f);
        Student chirag = new Student(26, 90.0f);

        Student[] list = {akash, harsh, harmik, darshit, chirag};
        System.out.println(Arrays.toString(list));
        System.out.println();

        Arrays.sort(list);    // One way
        System.out.println(Arrays.toString(list));
        System.out.println();

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);       //  - for descending order.
//            }
//        });

        // We can replace the above with lambda expression. (Lambda Functions)

        Arrays.sort(list, (o1, o2) -> {
            return -(int)(o1.marks - o2.marks);       //  - for descending order.
        });
        System.out.println();
        System.out.println(Arrays.toString(list));
        System.out.println();

//        if(akash < harsh) System.out.println("Harsh has more marks.");

        if(akash.compareTo(harsh) < 0){
            System.out.println("Harsh has more marks");
        }

    }
}

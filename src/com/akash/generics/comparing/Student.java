package com.akash.generics.comparing;

// Comparable is an interface with generic types.
public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
        public int compareTo(Student o){
        System.out.println("In Compare To Method : ");
        int diff = (int)(this.marks - o.marks);
        return diff;

        // If diff == 0, that means both are equal.
        // If diff < 0, then h.marks is bigger.
        // If diff > 0, then this.marks is bigger.
    };
}

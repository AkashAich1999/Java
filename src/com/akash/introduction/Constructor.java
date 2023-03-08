package com.akash.introduction;

public class Constructor {
    public static void main(String[] args) {
        Student_ akash = new Student_();
        System.out.println(akash.rno);
        System.out.println(akash.name);
        System.out.println(akash.marks);

        akash.greeting();
        akash.changeName("de_underdog");
        akash.greeting();

        Student_ darshit = new Student_(39, "Darshit Sorathiya", 88.5f);
        System.out.println();
        System.out.println(darshit.rno);
        System.out.println(darshit.name);
        System.out.println(darshit.marks);

        Student_ random = new Student_(akash);
        System.out.println();
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

    }
}

class Student_ {
    int rno;
    String name;
    float marks = 7.6f;

    void greeting(){
        System.out.println();
        System.out.println("Jai Mahakal !! ");
        System.out.println("My name is " + name);
    }

    void changeName(String name){
        this.name = name;
    }
    Student_() {
        this.rno = 57;
        this.name = "Akash Aich";
        this.marks = 8.0f;
    }

    Student_(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student_(Student_ other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}

package com.akash.introduction;

public class Constructor2 {
    public static void main(String[] args) {
        Student_s akash = new Student_s();
        System.out.println(akash.rno);
        System.out.println(akash.name);
        System.out.println(akash.marks);

        akash.greeting();
        akash.changeName("de_underdog");
        akash.greeting();

        Student_s darshit = new Student_s(39, "Darshit Sorathiya", 88.5f);
        System.out.println();
        System.out.println(darshit.rno);
        System.out.println(darshit.name);
        System.out.println(darshit.marks);

        Student_s random = new Student_s(akash);
        System.out.println();
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student_s random2 = new Student_s();
        System.out.println();
        System.out.println(random2.rno);
        System.out.println(random2.name);
        System.out.println(random2.marks);

    }
}

class Student_s {
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

//    Student_s() {
//        this.rno = 57;
//        this.name = "Akash Aich";
//        this.marks = 8.0f;
//    }

    Student_s(){
        this(57, "Akash Aich", 80.0f);
    }

    Student_s(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student_s(Student_s other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}


package com.akash.cloning;

public class Human2 implements Cloneable {
    int age;
    String name;
    int arr[];

//    public Human2(Human2 other){
//        this.age = other.age;
//        this.name = other.name;
//    }

    public Human2(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7,9};
    }

//    public Object clone(){
//        return super.clone();  // This will not work as it is declared with throws CloneNotSupportedException in the Object.java class.
//    }

    // We have to therefore mention it.
    @Override
    public Object clone() throws CloneNotSupportedException{
        // This is Shallow Copy.
        return super.clone();
    }
}

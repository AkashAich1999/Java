package com.akash.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    public Object clone(){
//        return super.clone();  // This will not work as it is declared with throws CloneNotSupportedException in the Object.java class.
//    }

    // We have to therefore mention it.
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

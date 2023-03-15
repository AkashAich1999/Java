package com.akash.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human akash = new Human(57,"Akash Aich");
        System.out.println(akash.age + " " + akash.name);
//        Human twin = new Human(akash);

        Human twin = (Human) akash.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}

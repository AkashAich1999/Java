package com.akash.cloning;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human2 akash = new Human2(57, "Akash Aich");
        System.out.println(akash.age + " " + akash.name);
//        Human twin = new Human(akash);

        Human2 twin = (Human2) akash.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        System.out.println();

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(akash.arr));  // Shallow Copy will be printed.
    }
}

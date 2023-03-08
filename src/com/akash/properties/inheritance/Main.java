package com.akash.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.h + " " + box.w);

        Box box2 = new Box(5);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        Box box3 = new Box(3,4,5);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);

        Box box4 = new Box(box2);
        System.out.println(box4.l + " " + box4.h + " " + box4.w);
    }
}

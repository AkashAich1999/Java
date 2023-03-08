package com.akash.properties.inheritance;

public class MainWeight {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.l + " " + boxWeight.h + " " + boxWeight.w + " " + boxWeight.weight);

        BoxWeight boxWeight2 = new BoxWeight(2,4,8,16);
        System.out.println(boxWeight2.l + " " + boxWeight2.h + " " + boxWeight2.w + " " + boxWeight2.weight);
    }
}

package com.akash.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

//    public BoxWeight(double l, double h, double w, double weight){
//        this.l = l;
//        this.h = h;
//        this.w = w;
//        this.weight = weight;
//    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }
}

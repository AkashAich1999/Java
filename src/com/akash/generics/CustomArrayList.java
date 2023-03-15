package com.akash.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // Also, working as an index of how many data. Not the size of the actual Array.

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        // Copy the Current Items to the New Array.
        for (int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }
    public int size(){
        return size();
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1, 6789);
//        list.size();
//        list.isEmpty();

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println(list);
        System.out.println();

        for(int i=1; i<12; i++){
            list.add(i*2);
        }

        System.out.println(list);
    }
}

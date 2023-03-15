package com.akash.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // Also, working as an index of how many data. Not the size of the actual Array.

    CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];   // new T[DEFAULT_SIZE] will give an error. We cannot create an instance of generic type.
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        // Copy the Current Items to the New Array.
        for (int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)data[--size];     // Casting is required because narrowing.
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }    // Casting is required because narrowing.
    public int size(){
        return size();
    }
    public void set(int index, T value){
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

//        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list);
//        System.out.println();
//
//        for(int i=1; i<12; i++){
//            list.add(i*2);
//        }
//
//        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Akash Aich");
        System.out.println();

        CustomGenericArrayList<Integer> list4 = new CustomGenericArrayList<>();
        list4.add(9);
        list4.add(8);
        list4.add(7);
        list4.add(6);
        list4.add(5);
        System.out.println(list4);

        for (int i=0; i<12; i++){
            list4.add(i*2);
        }
        System.out.println();
        System.out.println(list4);
    }
}

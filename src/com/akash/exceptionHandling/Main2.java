package com.akash.exceptionHandling;

public class Main2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            divide(a,b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am a finally block. I always run no matter what.");
        }
    }

    static int divide(int a, int b){
        return a/b;
    }
}

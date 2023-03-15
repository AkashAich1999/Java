package com.akash.exceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//    int c = a/b;    // Dividing by 0 gives ArithmeticException

//        try{
//            int c = a/b;
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        // The above try catch block with Exception class will also work.
        // The below try catch block also works,
//
//         try{
//            int c = a/b;
//        }catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

        try{
            int c = a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am a finally block. I always run no matter what.");
        }
    }
}

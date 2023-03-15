package com.akash.generics;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.Consumer;

// Lambda Functions are inline functions (i.e., One line functions)
public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++){
            arr.add(i + 1);
        }

        arr.forEach((item) -> System.out.println(item * 2));
        // We can also store this in a Consumer type also.

        System.out.println();
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        // We will store into an interface because Consumer is also an interface.
        Operation sum = (a,b) -> a + b;
        Operation sub = (a,b) -> a - b;
        Operation prod = (a,b) -> a * b;
        Operation div = (a,b) -> a / b;

        System.out.println();
        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(5,3,prod));
        System.out.println(myCalculator.operate(5,3,sub));
        System.out.println(myCalculator.operate(5,3,div));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }

    interface Operation {
        int operation(int a, int b);
    }
}



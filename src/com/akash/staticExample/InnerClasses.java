package com.akash.staticExample;

// Outside classes cannot be static if inside class is present. Inner/Inside classes can be static.
public class InnerClasses {
    static class Test {
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Akash");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

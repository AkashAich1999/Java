package com.akash.staticExample;
// Since, Java files are in the same package, therefore, we don't have to import it.
public class Main {
    public static void main(String[] args) {
        Human akash = new Human(23, "Akash Aich", 0, false);
        Human rahul = new Human(42, "Rahul Dravid", 1_00_00_000, true);
        Human arpit = new Human(30, "Arpit Rana", 1_00_000, false);

//        System.out.println(akash.population);
//        System.out.println(rahul.population);
//        System.out.println(arpit.population);

        System.out.println(Human.population);
    }
}

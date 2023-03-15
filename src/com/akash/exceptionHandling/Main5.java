package com.akash.exceptionHandling;

public class Main5 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
        // divide(a,b);
        // Mimicing an Exception
            String name;
            name = "Akash Aich";
            if(name.equals("Akash Aich")){
                throw new createException("My Name : Akash Aich");
            }
        }catch (createException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("I am a Normal Exception.");
        }finally {
            System.out.println("I am a finally block. I always run no matter what.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            // Explicitly Throwing.
            throw new ArithmeticException("Please do not divide by 0.");
        }
        return a/b;
    }
}

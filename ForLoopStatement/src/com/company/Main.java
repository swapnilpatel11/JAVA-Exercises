package com.company;

import static java.lang.System.*;

public class Main<i> {

    public static void main(String[] args) {
        System.out.println("10000 at interest rate of 2%= " + calculateInterest(10000, 2));

        for (int i = 0; i < 6; i++) {
            System.out.println("Loop " + i + " Hello");
        }
        //Challenge:
        // String.format is example for rounding

        for(int i = 2; i < 9; i++){
            System.out.println("10000 at interest rate of " + i + " % = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i +" is a Prime Number" );
                if(count == 20){
                    System.out.println("Exit the Loop");
                    break;
                }

            }
        }
    }



    public static boolean isPrime(int n) {
        if (n == 0) {
            return false;
        }
        // Another way for less loop
//        for(int i=2; i <= (long)Math.sqrt(n); i++ ){
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}



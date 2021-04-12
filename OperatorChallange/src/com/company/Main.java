package com.company;

public class Main {

    public static void main(String[] args) {

        double valueA = 20d;
        double valueB = 80d;
        double result = (valueA + valueB) * 100 ;
        System.out.println("Result 1 = " + result);

        double result2 = result % 40d ;
        System.out.println("Remainder = " + result2);

        boolean isZero = (result2 == 0) ? true : false;
        System.out.println("Is Zero = " + isZero);
        if (isZero = true){
            System.out.println("Remainder is Zero");
        }

        if (isZero = false){
            System.out.println("Remainder is not zero");
        }

        if(!isZero) {
            System.out.println("Got some remainder");
        }






    }
}

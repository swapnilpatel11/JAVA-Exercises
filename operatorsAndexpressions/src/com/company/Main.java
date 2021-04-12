package com.company;

public class Main {

    public static void main(String[] args) {
	// Operator

        int result = 10 + 5;
        System.out.println("10 + 5 = " + result);

        int previousResult = result;
        System.out.println("previous result = " + previousResult);

        result = previousResult - 1; // answer should be 14
        System.out.println("previous result minus 1 = " + result);

        result = result * 10; // 14 * 10 = 140
        System.out.println("Multiplication " + result);

        result = result / 5; // Division operator
        System.out.println("division operator = " + result);

        result = result % 3; // modulus operator
        System.out.println("MOdulus operator use = " + result);

        //abbreviation technique

        result++;
        System.out.println("new result plus = " + result);

        result--;
        System.out.println("new result minus = " + result);

        result += 2; // result + 2 =//
        System.out.println("Result + 2 = " + result);

        result *= 10; // result * 10 //
        System.out.println("Result * 10 = " + result);

        result /= 3; // result / 3 //
        System.out.println("Result / 3 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien");
        }
        int topScore = 80;
        if ( topScore < 100){
            System.out.println("You got the high score");
        }
        int secondTopScore = 60; // AND use
        if(topScore > secondTopScore && topScore < 100 ){
            System.out.println("you got the second top score and less than 100");
        }
            // OR use
        if ( topScore > 90 || secondTopScore <= 90){
            System.out.println("either or both conditions are true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("error solved");
        }
        int isClientAge = 20;  //turnery operator use
        boolean legalAgeOvereighteen = (isClientAge == 20) ? true : false ;
        if (legalAgeOvereighteen){
            System.out.println("Age is Valid");
        }
    }
}

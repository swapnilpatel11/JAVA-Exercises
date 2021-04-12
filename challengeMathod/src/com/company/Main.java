package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int highscore = calculateHighscorePosition(1000);
       displayHighscorePosition("Swapnil", highscore);
       

    }
    public static void displayHighscorePosition(String name, int highscore){
        System.out.println( name + " managed to get into position " + highscore + " on the high score table");
    }
    public static int calculateHighscorePosition(int score) {
        int position = 4;

        if (score >= 1000){
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;

//        if (score >= 1000) {
//            return 1;
//        }
//        else if ( score >= 500) {
//            return 2;
//        }
//        else if ( score >=  100) {
//            return 3;
//        } else {
//            return 4;
//        }




    }



}

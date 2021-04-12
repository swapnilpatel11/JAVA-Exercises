package com.company;

public class Main {

    public static void main(String[] args) {
//	boolean gameOver = true;
//	int score = 800;
//	int levelCompleted = 5;
//	int bonus = 100;
// Method Using Example calling method for using less method
	calculatescore(true,800,5,100);
	calculatescore(true, 10000,8,200);

//	if (score < 5000 &&  score >1000){
//        System.out.println("Score is less than 5000 and more than 1000");
//    } else if (score < 1000){
//        System.out.println("Score is less than 1000");
//    } else {
//        System.out.println("Got you");
//    }

//        if (gameOver == true){
//            int finalscore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalscore);
//        }
//
//        int secondscore = 10000;
//        int secondlevelcompleted = 8;
//        int secondbonus = 200;
//        if (gameOver){
//            int finalscore = secondscore + (secondlevelcompleted * secondbonus);
//            System.out.println("Your final score was " + finalscore);
//        }
    }
    public static void calculatescore( boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver == true){
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;
            System.out.println("Your final score was " + finalscore);

        }

    }
}

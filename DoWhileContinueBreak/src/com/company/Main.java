package com.company;

public class Main {

    public static void main(String[] args) {
	int number = 0;
	while(number<15){
	    number++;
	    if(number<=5){
            System.out.println("Skipping Number " + number);
            continue;
        }
        System.out.println("Number = " + number);
	    if(number>=10){
            System.out.println("Breaking at " + number);
            break;
        }
    }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
        //Challenge of switch
        char letter = 'D';
        switch (letter){
            case 'A':
                System.out.println("A Found");
                break;
            case 'B':
                System.out.println("B found");
                break;
            case 'C':
                System.out.println("C found");
                break;
            case 'D':
                System.out.println("D found");
                break;
            default:
                System.out.println("not found");
                break;
        }

    }
}




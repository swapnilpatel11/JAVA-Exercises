package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDigitCount(144));
    }
    public static int getDigitCount(int number){
        if (number<0) return -1;
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number>0);
        return count;
    }
}

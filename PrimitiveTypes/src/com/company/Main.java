package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinimumValue = Integer.MIN_VALUE;
        int myMaximumValue = Integer.MAX_VALUE;
        System.out.println("Minimum Int Value = "+ myMinimumValue);
        System.out.println("Maximum Int Value = " + myMaximumValue);
        System.out.println("Maximum busted value = " + (myMaximumValue +1));
        System.out.println("Minimum busted value = " + (myMinimumValue - 1));

        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value = " + myMinimumByteValue);
        System.out.println("Maximum Byte Value = " + myMaximumByteValue);

        //Challenge Primitive types video no. 27//

        byte value1 = 111;
        short value2 = 123;
        int value3 = 145;
        long value4 = (50000L + 10L*(value1 + value2 + value3));
        System.out.println("Challenge answer = " + value4);
        short value5 = (short) (1000 + 10 *(value1 + value2 + value3));
        System.out.println("Short challenege answer = " + value5);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	//char and boolean example
        char myCharValue = 'D';
        char myUnicodeChar = '\u00A9';
        System.out.println(myCharValue);
        System.out.println(myUnicodeChar);

        boolean isCustomerOverTwentyOne = true;
        System.out.println(isCustomerOverTwentyOne);

        // String primitive type using example
        String mystring = "I am Patel";
        System.out.println("my string is = " + mystring);
        mystring = mystring + "we are patel";
        System.out.println("My new string is " + mystring);
        mystring = mystring + "\u00A9 2019";
        System.out.println("new string " + mystring);

        //example of number string(it just show bot number together not doing addition)
        String numberstring = "120.45";
        numberstring = numberstring + "40.65";
        System.out.println("Number string " + numberstring);

        //another exapmle

        String lastString = "10";
        int intString = 50;
        lastString = lastString + intString;
        System.out.println("New string "+ lastString);

    }
}

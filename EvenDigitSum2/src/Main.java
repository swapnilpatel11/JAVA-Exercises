public class Main {
    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(125));
    }
}

//Explanation of ternary operator used:
//That part is a ternary operator, basically, it will add the left-hand side of the colon if the expression before the question mark is true, if the expression is false it will add the value on the right-hand side of the colon to the sum variable. It is a shortcut for using the if-else statement.
//
//If you are interested more on that: https://www.educative.io/edpresso/what-is-a-ternary-operator-in-java
//
//So I used ternary operator to tell the program if the checked digit is an even number, add that to our sum variable, if not just add 0 to sum so that sum doesn't change (i.e don't add anything).
//
//For example, we have 65 as a number initially. If the number is > 0 loop will execute and
//
//remainder = number % 10; this part will happen. Now our remainder is 5 .
//
//Ternary part comes after that, sum += (remainder % 2 == 0) ? remainder:0;
//
//and checks whether the remainder variable is even or not with this part (remainder % 2 == 0) . Since 5 is not an even number, we came to the part in the first paragraph and added 0 to our sum variable. So that sum is still 0.
//
//After that, with the line number /= 10; we divided 65 by 10 and number is now 6 (no decimal since it is an integer).
//
//Since 6 > 0, loop executes again, and this time by remainder = number % 10; remainder is 6. Going with the ternary part (remainder % 2 == 0) is true since 6 is an even number. And this time left-hand side of the colon in remainder:0 has been added to the sum.
//
//So in the end, we had a sum variable with an initial value of 0. And we have added to that 0 and 6 respectively. sum is now 6 which is the EvenNumberSum of 65.
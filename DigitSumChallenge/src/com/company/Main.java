package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digit 125 is " + sumDigits(125));
    }
    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        // 125 = 125/10 = 120 and remainder 5
        while (number > 0){
        int digit = number%10;
        sum += digit;
        //Drop least significant digit
            number /= 10;

        }
        return sum;

    }
}

//    Hi Bethany this is the logic:
//
//
//
//        lets take our number to be 125 ( we want to get: 1+2+5 = 8)
//
//
//
//        To get 5 (smallest digit) we do 125% 10 = 5 (this is added on using sum+=digit 0+5 =5)
//
//
//
//        Now the next step is  'number /=10 '(this takes 125/10 = 12.5, but since we are using 'int' data types this becomes 12 as the decimal 0.5 is dropped)
//
//
//
//        The number 12 is then looped once again starting from 12%10 =2 (this is because you get remainder 2 after you divide by 10)
//
//        Then we add this on using sum+=digit (so far: 5+2 = 7)
//
//        The value of 12 then goes through the next part which again is 12/10 =1 (remember it's an int data type 1.2 becomes 1)
//
//        Finally we go through the loop once more and do 1%10 = 1 (this is because 1 = 10*0 + 1(the remainder)), this then gets added on to give you 1+2+5 = 8.
//
//        The loop ends here because 1/10 = 0.1 =  0  (again int data type)
//
//
//
//        Hope this helps!

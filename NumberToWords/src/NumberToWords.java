public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0)
            System.out.println("Invalid Value");
        int count = getDigitCount(number);
        number = reverse(number);
        for(int i=0; i<count; i++){
            int digit = number%10;
            switch(digit){
                case 0:
                    System.out.print("Zero "); break;
                case 1:
                    System.out.print("One "); break;
                case 2:
                    System.out.print("Two "); break;
                case 3:
                    System.out.print("Three "); break;
                case 4:
                    System.out.print("Four "); break;
                case 5:
                    System.out.print("Five "); break;
                case 6:
                    System.out.print("Six "); break;
                case 7:
                    System.out.print("Seven "); break;
                case 8:
                    System.out.print("Eight "); break;
                case 9:
                    System.out.print("Nine "); break;
                default: break;
            }
            number /= 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit = 0;
        while(number!=0) {
            digit = number%10;
            reverse = (reverse*10) + digit;
            number /= 10;
        }
        return reverse;
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

//Definitely challenging and requiring everything we've learned (switch, for loop, while loop, do while loop).
//
//I'm providing two solutions: a) manipulation of numbers and b) manipulation of strings.
//
//a) Solution by manipulating numbers:
//
//Although the instruction provided the hint "to get the number of zeroes, check the difference between the digit count from the original number and the reversed number", I decided to use the existing switch/case to print out the extra zeros by looping and using the digit count from the original number as the for loop condition.  This makes the code much more concise without the need for additional code to handle the extra zeros.
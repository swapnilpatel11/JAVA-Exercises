public class FactorPrinter {
    public static void FactorPrint(int number){
        if(number < 1)
            System.out.print("Invalid Value");

        for(int i=1; i<=number; i++){
            if(number%i==0)
                System.out.print(i + " ");
        }
    }
}
//
//    Try to read more about modulo %, println vs print to understand the line of code.
//
//        Since the for loop is looping from 1 to the parameter value (i.e. argument), the program is looking for any number that can be divided into the argument and get a whole number.  Modulo will give the remainder of dividing number by i.  So number%i, means if number is divisible by i, then the remainder is 0...which is written (number%i == 0). Once that condition is true, print the value.
//
//        My code is different because instead of using println to print the string and do a carriage return, the use of print will not do a carriage return.  Thus, to space out the numbers, the + " " concatenate the space so that each number is separated by a space, hence the output 1 2 3 6.

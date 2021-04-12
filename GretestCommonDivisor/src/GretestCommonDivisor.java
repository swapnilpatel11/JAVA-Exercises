public class GretestCommonDivisor {
    public static int getGretestCommonDivisor(int first,int second){
        if (first<10 || second < 10){
            return -1;
        }
        int min = first < second ? first:second;
        int divisor = 0;
        for(int i=min;i>1;i--){
            if(first%i==0 && second%i==0){
                return divisor=i; //return highest divisor and break the loop
            }

        }
        return 1; //nonzero number has 1 common divisor
    }
}

    //A performant solution (i.e. least amount of processing) by finding the minimum of the two numbers (line 4) then using the min to start the for loop and count down until we find the first common divisor (which is the greatest common divisor) and break out of the loop rather than continue wasted processing of subsequent irrelevant common divisors.

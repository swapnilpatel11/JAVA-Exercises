public class Main {
    public static void main(String[] args) {
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(223));
    }
}
//Explanation:
//The purpose of the loop is to find the first number, so the loop will go on and on till the number will be > 0 , when that number is <= 0 then the loop will stop, and then the first number will be the last number from the loop that was > 0.
//Ex number 222 > 0 (true)
//loop 1:
//fD = 222 % 10; the reminder will be 2, so fD = 2 now.
//222 /10 = 22. the number will be 22 now.
//22 > 0 ( true)

//loop 2;
//fD= 22 % 10;  the reminder will be 2, so fD = 2 now.
//22 / 10 = 2, so the number will be 2 now.
//2 > 0 (true)
//loop 3:
//fD = 2 % 10 ; the remainder will be 2, so fD = 2 now.
//2 / 10 = 0.2, so the number will be 0 now cuz it's an integer and it doesn't count anything after the dot (.)
//next, it will check the number again so,
//0 > 0 ( false)  so the loop won't start this time, that means fD (firstDigit is now the last number that was greater than 0. This means the fD will be the number just before the loop 3, cuz after loop 3 the number was 0.
//I hope this helps. I mean this is how I see it.
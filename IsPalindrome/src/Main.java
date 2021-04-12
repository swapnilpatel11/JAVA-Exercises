public class Main {
    public static void main(String[] args) {
        System.out.println(NumberPalidrome.isPalindrome(123));
    }
}
//Explanation:
//Hi there! Best way to understand any code is to first understand the problem then translate the steps into code.
//Let says given this input 121. From human perspective we know it is. How do we know? Well because the first and last digits are the same leaving the middle digit which is unique. Now lets try with 1221. Again, we know its a palindrome because first and last digits are same and next digits are the same too. It seems like we are using a common data structure approach called pointers where we check the start and last then the second and second last etc. We can also look at it like this : If the number reverse is equal to the original number than it is a palindrome.
//
//To translate this to code using the second approach(text in bold), lets write the steps out first.
//1) reverse the number
//2) check if reverse is equal to original.
//
//To translate this to java we need to know how to reverse a digit. Using what we learned so far in the course, we learned about the % and / operators. We can use this to reverse the number. So lets say we want to reverse 123.
//We know the reverse needs to look like 321. 321 is also same as 300 + 20 + 1. Do you see the pattern? A multiple of 10 each time. Using this ,
//
//int temp = number;
//int reverse = 0;
//while(temp >0){
//int current = temp % 10;
//reverse  = current + reverse; <--- when we get to last digit we have 321 but because we multiple 10 next line
//reverse = reverse * 10; <--- this results in 3210 instead of 321 at the final step.
//// what reverse will look like each step is this: reverse = (0 + 3 ) * 10,  reverse = (30+ 2) * 10, (320+1).
//temp = temp/10;
//
//}
//
//// at this step we get 3210 <--- we need to divide by 10 to get 321
//reverse = reverse/10;
//
//Now all we have to do is check this reverse number which is 321 if it equals to 123. In this case its false. To check if same we just use == to compare.
//
//I encourage you try to implement this code logic or another. Hope this helps!
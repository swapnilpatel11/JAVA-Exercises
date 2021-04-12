public class Oops2 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("x is " + x);
        first();
    }

    public static void first() {
        int x = 15; // set x to 15
        System.out.println("x is now " + x);
        int y; //set y to 1 more than x
        y = x + 1;
        System.out.println("x and y are " + x + " and " + y);
    }
}
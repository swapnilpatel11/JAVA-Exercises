public class Main {
    public static void main(String[] args) {
        System.out.println( PlayingCat.isCatPlaying(false,45));
    }
}


//short code by using ternary operator:
//public class PlayingCat {
//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        int upperLimit = summer ? 45 : 35;
//        return temperature >= 25 && temperature <= upperLimit;
//    }
//}
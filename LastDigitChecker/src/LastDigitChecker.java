public class LastDigitChecker {
    public static boolean hasSameLastDigit(int v1,int v2,int v3){
        if((v1 < 10)||(v1>1000)||(v2<10)||(v2>1000)||(v3<10)||(v3>1000)){
            return false;
        }
        return ((v1%10==v2%10)||(v2%10==v3%10)||(v3%10==v1%10));
    }
    public static boolean isValid(int number){
        if((number<10)||(number>1000)){
            return false;
        }
        return true;
    }
}

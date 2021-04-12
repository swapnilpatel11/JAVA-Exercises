public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if((bigCount<0)||(smallCount<0)||(goal<0)){
            return false;
        }
        return ((bigCount*5)+smallCount >= goal)&&((goal%5)<=smallCount);
    }
}


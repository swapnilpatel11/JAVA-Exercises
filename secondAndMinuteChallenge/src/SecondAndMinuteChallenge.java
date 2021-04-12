public class SecondAndMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(61,59));
        System.out.println(getDurationString(61));
    }
    private static String getDurationString(long minutes,long seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid Value";
        }
        long hours = minutes / 60;
        long remainedMinute = minutes % 60;

        String hoursString = hours + "h ";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }
        String minuteString = remainedMinute + "m ";
        if(remainedMinute < 10){
            minuteString = "0" + minuteString;
        }
        String secondString = seconds + "s ";
        if(seconds < 10){
            secondString = "0" + secondString;
        }
            return hoursString + minuteString + secondString;

    }
    private static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainedSeconds = seconds % 60;
        return getDurationString(minutes,remainedSeconds);
    }
}

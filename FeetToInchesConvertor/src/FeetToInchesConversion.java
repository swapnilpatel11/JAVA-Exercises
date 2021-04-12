public class FeetToInchesConversion {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeter(13);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && ((inches >=0) && inches <= 12) ){
            double centimeter = (feet * 30.48) + (inches * 2.54);
            System.out.println("Centimeters = " + centimeter + " cm");
        }
            return -1;
    }
    public static double calcFeetAndInchesToCentimeter(double inches){
     if(inches >= 0){
         double inchesToFeet = (int) (inches /12);
         double inchesRemained = (int) (inches % 12);
         System.out.println("Inches to Feet = " + inchesToFeet + " Feet and " + inchesRemained + " Inches");
         calcFeetAndInchesToCentimeters(inchesToFeet, inchesRemained);
     }
     return -1;
    }
}

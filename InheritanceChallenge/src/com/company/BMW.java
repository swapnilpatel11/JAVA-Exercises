package com.company;

public class BMW extends Car{
    private int roadServiceMonths;

    public BMW(int roadServiceMonths) {
        super("BMW", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity < 10){
            changeGear(1);
        }else if(newVelocity>10&&newVelocity<30){
            changeGear(2);
        }else if(newVelocity>30&&newVelocity<50){
            changeGear(3);
        }else if(newVelocity>50&&newVelocity<70){
            changeGear(4);
        }else if(newVelocity>70&&newVelocity<100){
            changeGear(5);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}

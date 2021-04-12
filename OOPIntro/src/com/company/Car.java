package com.company;

import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase(Locale.ROOT);
        if(validModel.equals("carrera") || validModel.equals("corolla")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}

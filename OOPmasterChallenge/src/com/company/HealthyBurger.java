package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
    public void addHealthyAddition1(String name,double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamBurgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            hamBurgerPrice += this.healthyExtra1Price;
            System.out.println("Added "+healthyExtra1Name+" for an extra "+healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null){
            hamBurgerPrice += this.healthyExtra2Price;
            System.out.println("Added "+healthyExtra2Name+" for an extra "+healthyExtra2Price);
        }
        return hamBurgerPrice;
    }
}

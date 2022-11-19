package com.java.conditional_statements;

public class LetsHaveCoffee {
    boolean isCupEmpty=true;

    public static void main(String[] args) {
        LetsHaveCoffee coffee = new LetsHaveCoffee();

        if(coffee.isCupEmpty)
            System.out.println("Fill the cup");
        else
            System.out.printf("Drink the coffee");


    }
}

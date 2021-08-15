package com.Abstraction;

public class Benz extends car{
    @Override
    public void companySecret(){
        System.out.println("Benz's Company Secret");
    }
    @Override
    public void engineSecret(){
        System.out.println("Benz's Engine Secret");
    }


    public static void main(String[] args) {
        car Car = new Benz();
        Car.companySecret();
        Car.engineSecret();

    }
}

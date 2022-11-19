package com.Abstraction;

public class Bmw extends car{
    @Override
    public void companySecret(){
        System.out.println("Bmw's Company Secret");
    }
    @Override
    public void engineSecret(){
        System.out.println("Bmw's Engine Secret");
    }

    public static void main(String[] args) {
        car Car = new Bmw();
        Car.companySecret();
        Car.engineSecret();


    }
}

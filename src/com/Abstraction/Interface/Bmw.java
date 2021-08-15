package com.Abstraction.Interface;

public class Bmw extends car implements Interface2{
//    By these many implementations we can support multiple Inheritance
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
/*--------------------------------------*/
        Bmw Car1 = new Bmw();
        Car1.method1();
        Car1.method2();
/*--------------------------------------*/
        Car1.method3();

    }

    @Override
    public void method1() {
        System.out.println("method 1 implemented ");
    }

    @Override
    public void method2() {
        System.out.println("method 2 implemented ");
    }
    @Override
    public void method3() {
        System.out.println("method 3 implemented from Interface2 ");
    }
}

package com.Inheritance;

public class Bmw extends car {
    // Bmw is the child of car class
    //IS-A relationship(Inheritance) are same...

    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.engine();
        System.out.println("The n.o of wheels "+bmw.wheels);
    }

}

package com.StaticKeyword;

public class StaticMethod {

    public static void method1(){
        System.out.println("Static Method ");
    }
    public void nonStatic(){
        System.out.println("NON_static ");

    }

    public static void main(String[] args) {
       // StaticMethod methods = new StaticMethod();
        // methods.method1();
        // I dont need to create an obj if I wanna to access static instance

        method1();
        StaticMethod methods = new StaticMethod();
        methods.nonStatic();
    }

}

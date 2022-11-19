package com.StaticKeyword;

public class StaticBlock {

    static{

        System.out.printf("Inside static block 1 \n");
    }
    static{
        System.out.printf("Inside static block 2\n");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method..!");
    }
}

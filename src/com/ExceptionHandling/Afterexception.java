package com.ExceptionHandling;

public class Afterexception {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            System.out.println(1/0);
//      when an exception occur the control will go to the respective catch block
//      remaining program will not get executed
            System.out.println("after exception occur ");

        }

        finally{
            System.out.println(1/0);
            System.out.println("Inside final block");
        }
    }
}

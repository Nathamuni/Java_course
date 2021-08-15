package com.ExceptionHandling;

import com.StaticKeyword.StaticVariable;

public class trycatch {
//    static  String name;
    public static void main(String[] args) {

        try{
            int num =0;
            int num1 =3;

//            System.out.println(name.length());
            int result = num1/num;
            System.out.println(result);
        }catch(ArithmeticException A){
            System.out.println("Don't divide by zero");
        }
        catch(NullPointerException n){
            System.out.println("This is due to NULL pointer exception");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("try again...!");
//            Since exception can handle any exception it should be placed last
        }finally {
            System.out.println("Inside finally block..!");
        }
    }
}

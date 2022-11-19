package com.StaticKeyword;

public class StaticVariable {
    static int accountBalance=0;
    String depositedby;

    public static void main(String[] args) {
        StaticVariable object1 = new StaticVariable();
        object1.accountBalance=1000;    // I am willingly creating an object for a static variable
        object1.depositedby= "Nathamuni";

        /* if I try to change NON-static variable _depositedby_
        inside of a static function(without an obj)
        we will get an ERROR..!
         */
        StaticVariable object2 = new StaticVariable();
        object2.accountBalance=2500;
        object2.depositedby="ram";

        System.out.println("object1 integer: "+object1.accountBalance);
        System.out.println("object1 Name: "+object1.depositedby);
        System.out.println("object2 integer: "+object2.accountBalance);
        System.out.println("object2 Name: "+object2.depositedby);
        // since accountBalance is a static variable the last value assigned
        // will get stored in any static variable..!
    }
}

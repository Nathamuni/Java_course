package com.lao.Constructor;

public class ChildClass extends ParentClass {
    /*We don't create obj for parent class here
     When we use [extends] keyword there exists a inbuilt keyword */
     //super();

    public ChildClass(){
        super();
         System.out.println("Child class constructor");
    }
    public static void main(String[] args) {
        ChildClass childclass = new ChildClass();
    }


}

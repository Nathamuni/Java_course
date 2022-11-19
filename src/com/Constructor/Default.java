package com.Constructor;

public class Default {
    String student_name;
    int rollNo;
    Integer BatchNo;


    //example for a default constructor
    //Here we dont explicitly define the value...(default)

    public static void main(String[] args) {
        Default student1 = new Default();// Since Student() looks like a function
                                        // we call it as a special type of function
        System.out.println(student1.student_name);//NULL for class obj
        System.out.println(student1.rollNo); // int value in default will be 0
        System.out.println(student1.BatchNo); // Since it is a wrapper class we get NULL
    }
}

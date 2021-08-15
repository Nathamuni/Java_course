package com.lao.Constructor;

public class NoArgumentConstructor {
    int employeeID;
    String employeeName;
    // Defining a NO argument constructor

    NoArgumentConstructor(){
        employeeID = 123;
        employeeName = "Nathamuni";
        System.out.println("Name is "+employeeName+" \nId n.o is "+employeeID);
        System.out.println("Employee obj is created ");
// we are performing several operations inside constructor block
    }
    public static void main(String[] args) {
        NoArgumentConstructor employee1 = new NoArgumentConstructor();
    }
}

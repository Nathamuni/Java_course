package com.Polymorphism.Overriding;

public class son extends Parent {

    @Override // pottalum podaatium onnuthan
    public void marriage(){
        System.out.println("Vaipilla Raja..!");
    }

    public static void main(String[] args) {
        Parent parent = new son(); // PArent class referance is equal to child class object
        parent.properties();
        parent.marriage();
    }

}

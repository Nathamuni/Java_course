package com.Constructor;

public class paramaterizedCons {
    String animal_name;
    String animal_type;

    paramaterizedCons(String Name, String Type) {
        animal_name = Name;
        animal_type = Type;
    }
    public void sayAboutAnimal(){
        System.out.println("The animal Name is "+ animal_name +" and its type is "+ animal_type);
    }

    public static void main(String[] args) {
        paramaterizedCons animal1 = new paramaterizedCons("Duck","Omnivores");
        animal1.sayAboutAnimal();
        paramaterizedCons animal2 = new paramaterizedCons("karadi kutti","Herbivores");
        animal2.sayAboutAnimal();
        }
    }

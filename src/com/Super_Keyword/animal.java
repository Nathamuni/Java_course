package com.Super_Keyword;

class Animal{
    String color="brown";
}
class Goat extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Goat class
//                           ^Here we can also use  (this.color);
        System.out.println(super.color);//prints color of Animal class  
    }
}
// super is used to refer immediate parent class variables
// It is only used when the parent class and child class have the same instance fields
class Test{
    public static void main(String args[]){
        Goat aadu = new Goat();
        aadu.printColor();
    }
}

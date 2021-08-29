package com.Constructor;

public class ConstructorOverloading{

    String draw;

    ConstructorOverloading(){
        System.out.println("Draw object created");
    }

    ConstructorOverloading(String todraw)
    {
        draw = todraw;
        System.out.println("Drawing "+todraw);
    }


    public static void main(String[] args)
    {
        ConstructorOverloading  draw1 = new ConstructorOverloading();
        ConstructorOverloading draw2 = new ConstructorOverloading("Circle");

    }

}

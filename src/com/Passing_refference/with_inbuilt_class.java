package com.Passing_refference;
import java.awt.*;
public class with_inbuilt_class {

    public static void main(String[] args) {
        Point p = new Point(); // Point is an inbuilt class which we can create objs that are points
        p.x = 12;
        p.y = 25;
        System.out.println("x = "+p.x + " y = "+p.y);
        change(p); // try guess the output
        System.out.println("x = "+p.x + " y = "+p.y);
    }
    public static void change(Point P){
        P.x = 10;
        P.y = 20;
    }
}


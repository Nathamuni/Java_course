package com.javaLearning;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        String name;
        char c;
        Scanner scan = new Scanner(System.in);

//      To read a single word from output screen

        System.out.print("Enter your Name : ");
        name = scan.next();
        System.out.println("Your Name is : "+name);

        System.out.print("Enter your age : ");
        System.out.println("you are : "+scan.nextInt());

//      Reading the whole sentence

        System.out.print("Enter a sentence : ");
        System.out.println(scan.nextLine());

//        To read single(first character)
        System.out.print("Enter a Character : ");
        c = scan.next().charAt(0);
        System.out.println(c);
//      We can also get input of other datatypes..!
    }
}

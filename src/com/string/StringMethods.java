package com.string;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Nathamuni"; //String literal
        int number = 5;

        System.out.println("1) " + name.charAt(1));

        System.out.println("2) "+name.length());

        System.out.println("3) "+name.equals("Nat"));

        System.out.println("4) "+name.equalsIgnoreCase("nATHamuNi"));

        System.out.println("5) " + name.isEmpty());

        System.out.println("6) " + name.contains("tha"));

        System.out.println("7) " + name.substring(3));

        System.out.println("8) " + name.substring(1,8));

        System.out.println("9) " + name.concat(" is a gud boy..!"));

        System.out.println("10) " + name.replace("thamuni","rayanan"));

        System.out.println("11) " + name.indexOf("m"));

        System.out.println("12) " + name.indexOf("a",2));

        System.out.println("13) " + name.trim());

        System.out.println("14) " + String.valueOf(number));
//        This method will convert any DT to string..!

        System.out.println("15) " + name.toUpperCase());

        System.out.println("16) " + name.toLowerCase());

        System.out.println("17) " + name.join("/","26","09","2002"));

        System.out.println("18) ");
        String splitThis = "This,is,Nathamuni";
        String[] words = splitThis.split(",");
        for(String string : words)
        {
            System.out.println(string);
        }
        System.out.println("19) ");
        String s = "Nathu";
        char[] arr = s.toCharArray();
        for (char str:arr) {
            System.out.println(str);
        }

    }
}

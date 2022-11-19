package com.string;

public class StringBuffer_sample {
    public static void main(String[] args) {
        System.out.println("String is IMMUTABLE");
        String name = "Natha";
        System.out.println("Appending a name with original: "+name.concat("muni"));
        System.out.println("Original name is : "+name);
//        on concat new obj is created and "name" is still in memory

        System.out.println("*********************************************");

        System.out.println("StringBuffer is MUTABLE");
        StringBuffer name1 = new StringBuffer("Nathu");
        System.out.println("Appending a name with original: " + name1.append("muni"));
        System.out.println("Original name is : "+name1);
//        on appending "name1" gets overwritten
    }
}

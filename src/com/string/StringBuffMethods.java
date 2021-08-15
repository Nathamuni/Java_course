package com.string;

public class StringBuffMethods {

    public static void main(String[] args) {
        StringBuffer strbuf = new StringBuffer("inumahtaN");

        System.out.println("Reverse string "+strbuf.reverse());

        System.out.println("replace the string "+strbuf.replace(4,9,"u"));

        System.out.println("delete "+strbuf.delete(4,5));

        System.out.println("inserting elements "+strbuf.insert(4,"amuni"));

        System.out.println("checking the capacity "+ strbuf.capacity());

//        And we also have string funs like charAt , substring , length
    }


}

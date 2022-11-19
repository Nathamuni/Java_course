package com.Passing_refference;

 class reference {
     int i=2,j=4;

     public static void method1(){
        System.out.println("sample of reference ");
     }
    private static void change(reference m){ //referring to this class
        m.i=12;
        m.j=92;
     }

    public static void main(String[] args) {

        method1();
        reference methods = new reference();
        System.out.println("Initial values (on declaration) => i = "+methods.i+", j = "+methods.j);
        change(methods);
        System.out.println("Values after encounter of change() => i = "+methods.i+", j = "+methods.j);


    }



 }

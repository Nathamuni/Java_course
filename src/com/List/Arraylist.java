package com.List;
import java.util.Iterator;
import java.util.List; // parent interface containing ArrayList
import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {

    public static void main(String[] args) {

        //    <Generics used to denote the datatype we wanna store> (If needed)
        ArrayList<String> arraylist = new ArrayList<String>(); //Overriding

        arraylist.add("Audi");
        arraylist.add("BMW");
        arraylist.add("Benz");
        arraylist.add("Bugatti");
        arraylist.add("Bugatti");//     Allows duplicate

        System.out.println(arraylist);//    Insertion order is maintained

        System.out.println(arraylist.get(1));

        System.out.println(arraylist.indexOf("Bugatti")); //  Returns -1 if not found

        System.out.println(arraylist.lastIndexOf("Bugatti"));

        java.util.List<String> newarr = new java.util.ArrayList<String>(5);
        newarr.addAll(arraylist);

        System.out.println(newarr);

        newarr.clear();
        System.out.println(newarr);

        arraylist.remove(0);    // Can also use the object name
        System.out.println(arraylist);

        arraylist.add("null");
        System.out.println(arraylist);

        arraylist.set(3, "Tata");
        System.out.println(arraylist);
//         iterating through Array list:
        System.out.println("-------------------------------------------");
//Foreach loop :
        for (String string : arraylist) {
            System.out.println("For each loop : " + string);
        }
        System.out.println("-------------------------------------------");
//For loop :
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println("For loop : " + arraylist.get(i));
        }
        System.out.println("-------------------------------------------");
//ListIterator :

        ListIterator<String> li = arraylist.listIterator();
//    since ^ is an interface                   ^ is a method which handles the iteration process
//        we can't create object(new)              specified inside ListIterator

        while (li.hasNext()) {
            System.out.println("ListIterator Forward : " + li.next());

        }
        System.out.println("*********************************************");
        while (li.hasPrevious()) {
            System.out.println("ListIterator backward : " + li.previous());
        }
        System.out.println("-------------------------------------------");

//Iterator :
        Iterator<String> it = arraylist.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator : " + it.next());
//     Can only traverse in forward direction..!
        }
    }
}
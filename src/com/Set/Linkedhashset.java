package com.Set;
import java.util.LinkedHashSet;

public class Linkedhashset {


        /**
         * LinkedHashSet->Child class of HashSet
         * DS-> Hash table + Linked List
         * Insertion order is preserved
         * Duplicates not allowed
         */

        public void linkedHashSetExample(){
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(1);
            linkedHashSet.add("A");
            linkedHashSet.add("B");
            linkedHashSet.add("C");
            linkedHashSet.add("10");
            linkedHashSet.remove("A");

            System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);
        }

        public static void main(String[] args) {
            Linkedhashset example= new Linkedhashset();
            example.linkedHashSetExample();
        }

    }

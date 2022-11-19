package com.Set;

import java.util.TreeSet;
import java.lang.*;
import java.util.Iterator;
 public class sample {
    public void Example(){
        TreeSet<String> treeSet= new TreeSet<String>() ;
        treeSet.add("a");
        treeSet.add("A");
        treeSet.add("ab");
        treeSet.add("aabb");
        treeSet.add("aab");
        treeSet.add("abbb");
        System.out.println("Elements are sorted on ascending order :"+ treeSet);
        }
    public void Iter()
    {
        TreeSet<String> treeSet= new TreeSet<String>() ;
        treeSet.add("a");
        treeSet.add("A");
        treeSet.add("ab");
        treeSet.add("aabb");
        treeSet.add("aab");
        treeSet.add("abbb");
        Iterator itr = treeSet.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
    public void Iter1()
    {
        TreeSet Set= new TreeSet() ;
        Set.add(new StringBuffer("a")); //creating object for each elements(string buffer)
        Set.add(new StringBuffer("A"));
        Set.add(new StringBuffer("ab"));
        Set.add(new StringBuffer("aabb"));
        Set.add(new StringBuffer("aab"));
        Set.add(new StringBuffer("abbb"));
        System.out.println(Set);
        Iterator itr1 = Set.iterator();
        while(itr1.hasNext())
            System.out.println(itr1.next());

    }


    public static void main(String[] args) {
        sample treeSet= new sample();
        treeSet.Example();
        treeSet.Iter();
        System.out.println("---------------------------------------");
        treeSet.Iter1();

    }

}

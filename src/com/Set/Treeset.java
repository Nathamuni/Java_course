package com.Set;
import java.util.TreeSet;
import java.lang.*;
import java.util.Iterator;
public class Treeset {

    /**
     * TreeSet is the implementation class of SortedSet Interface.
     * Does not allow duplicates.
     * Sorts the elements
     * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
     * Difference between Hashset and Treeset, hash doesnt maintain order
     * but Treeset maintains ascending or alphabetical order.
     * DS-> Balanced Tree
     * Heterogeneous data not allowed. If added Exception, ClassCast will occur
     * For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
     * To say any class is comporable or not, the class should implement comparable interface.
     */
    /*
     * Constructors present are 4
     * 1. TreeSet ts= new TreeSet();// default sort order
     * 2. TreeSet ts= new TreeSet(Comparator c);// customized sorting order defined by comparator object
     * 3. TreeSet ts= new TreeSet(Collection c);// equivalent tree set of any collection will be created
     * 4. TreeSet ts= new TreeSet(SortedSet s);// creates tree set for given sorted set
     */
    public void treeSetExample(){
        //Creating object
        TreeSet<Integer> treeSet= new TreeSet<Integer>() ;
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(3);

        System.out.println("Elements are sorted on ascending order :"+ treeSet);


        System.out.println("First element :"+treeSet.first());

        System.out.println("Last element :"+treeSet.last());

        System.out.println("Values lesser than given value"+treeSet.headSet(3));

        System.out.println("Values equal to and higher than given value"+treeSet.tailSet(9));

        System.out.println("Subset values :"+treeSet.subSet(2, 9));

        System.out.println("Comparator returns null if the sorting is default natural order :"+ treeSet.comparator());

        System.out.println("next higher value :"+treeSet.higher(7));

        System.out.println("next Lower value :"+treeSet.lower(7));

        System.out.println("next pollFirst value :"+treeSet.pollFirst());
//      Retrives that element and delete it..!
        System.out.println("next higher poolLast :"+treeSet.pollLast());
        System.out.println(treeSet);

        //Adding null to a non empty tree set causes null pointer excpetion
        //treeSet.add(null);
        /*null can be easily added if the tree set is empty. If there are any elements present, the
         * comparator will check for the sorting order between the previosly added element and
         * the null. Since it compares null with the objects exisiting we are getting NPE.
         * Same is the case, if we add null first and add other elements, NPE will happen.
         */


    }
    public void iterator(){
        TreeSet<Integer> treeSet= new TreeSet<Integer>() ;
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(3);
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------------");
//       here we dont have .previous,.hasPrevious methods so we can use descending operation to Iterator
        Iterator iterator1 = treeSet.descendingIterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }
    }

    public static void main(String[] args) {

        Treeset treeSetExample= new Treeset();
        treeSetExample.treeSetExample();
        treeSetExample.iterator();
    }

}

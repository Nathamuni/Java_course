package com.List;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlist {
    public void linkedListOperationsExample(){

        LinkedList< Integer> linkedList= new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("Linked List :"+ linkedList);

        linkedList.addFirst(1);
        System.out.println("Linked List after adding first:"+ linkedList);

        linkedList.addLast(5);
        System.out.println("Linked List after adding last:"+ linkedList);


        System.out.println("First Value :" +linkedList.getFirst());

        //Get the first value using index position
        System.out.println("First Value using index :"+linkedList.get(0));


        System.out.println("Remove first :"+linkedList.removeFirst());
        System.out.println("After Remove first" +linkedList);
        System.out.println("Remove last :"+linkedList.removeLast());
        System.out.println("After Remove last" +linkedList);

        System.out.println(linkedList.poll());
        System.out.println(linkedList);

        //pollLast deletes the last
        linkedList.pollLast();
        System.out.println(linkedList);

        //remove deletes the first element
        linkedList.remove();
        System.out.println(linkedList);

        //Adding
        linkedList.addFirst(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        //removeFirstOccurence
        linkedList.removeFirstOccurrence(2);
        System.out.println("After removing the first occurence of 2 "+ linkedList );

        //removeLastOccurrence
        linkedList.removeLastOccurrence(6);
        System.out.println("After removing the last occurence of 6 "+ linkedList );

        System.out.println("-----------------------------------------------------");
    }

    public void iterateLinkedListWithSimpleFor(){
//    For loop
        LinkedList< String> linkedList= new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println("Simple For loop");
        for (int index=0;index<linkedList.size();index++){
            System.out.println("Elements in the LL are "+ linkedList.get(index));
        }
        System.out.println("-----------------------------------------------------");
    }

//    For Each loop

    public void iterationWithAdvancedFor(){
        LinkedList< String> linkedList= new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println("For Each");
        for (String string : linkedList) {
            System.out.println("Elements in the LL are "+ string);
        }
        System.out.println("-----------------------------------------------------");
    }

    //    While loop
    public void iterateUsingWhile(){
        LinkedList< String> linkedList= new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        int number=0;
        System.out.println("While");
        while(linkedList.size()>number){
            System.out.println("Elements in the LL are "+ linkedList.get(number));
            number++;
        }
        System.out.println("-----------------------------------------------------");
    }

    //    Iterator
    public void iterateUsingIterator(){
        LinkedList< String> linkedList= new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        Iterator<String> iterator=linkedList.iterator();
        System.out.println("Iterator");
        while(iterator.hasNext()){
            System.out.println("Elements in the LL are "+ iterator.next());
        }
        System.out.println("-----------------------------------------------------");
    }



    public static void main(String[] args) {
        Linkedlist linkedListExample = new Linkedlist();
        linkedListExample.linkedListOperationsExample();
        linkedListExample.iterateLinkedListWithSimpleFor();
        linkedListExample.iterationWithAdvancedFor();
        linkedListExample.iterateUsingWhile();
        linkedListExample.iterateUsingIterator();
    }

}


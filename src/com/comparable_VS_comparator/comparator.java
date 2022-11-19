package com.comparable_VS_comparator;
import java.util.*;
class Student1 {

  int rollno, age;
  String name;

 Student1(Integer rollno, String name, Integer age) {
  this.rollno = rollno;
  this.age = age;
  this.name = name;
 }
}
//---------------------------------------------------

class AgeComparator implements Comparator<Student1>{
 public int compare(Student1 s1, Student1 s2){  // here we pass 2arguments
   if(s1.age>s2.age)
    return 1;
   else
    return -1;
 }
}

//---------------------------------------------------

class NameComparator implements Comparator<Student1>{
 @Override
 public int compare(Student1 s1, Student1 s2) {
  return s1.name.compareTo(s2.name);  // compareTo will return 0 if both strings are equal
                                      // or else return +ve (or) -ve n.os with respect to Lexicographic condition
 }
}
//---------------------------------------------------

class TestComparator{
 public static void main(String args[]) {
//Creating a list of Student1s  
  ArrayList<Student1> ary = new ArrayList<Student1>();
  ary.add(new Student1(67, "Nathamuni", 19));//Adding by creating object with reference to Student1[Constructor]
  ary.add(new Student1(25, "Raja", 55));
  ary.add(new Student1(45, "Raman", 50));
  ary.add(new Student1(49, "Krishna", 37));
  ary.add(new Student1(60, "Sanjay", 12));
  ary.add(new Student1(31, "Hari", 24));

  System.out.println("\t\tSorting by Name");
//Using NameComparator to sort the elements  
  Collections.sort(ary, new NameComparator());
//Traversing the elements of list
  for (Student1 st : ary) {
   System.out.println(st.rollno + " " + st.name + " " + st.age);
  }


  System.out.println("\t\tSorting by Age");
//Using AgeComparator to sort the elements  
  Collections.sort(ary, new AgeComparator());
//Travering the list again
  for (Student1 st : ary) {
   System.out.println(st.rollno + " " + st.name + " " + st.age);
  }
 }
}
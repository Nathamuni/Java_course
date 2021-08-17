package com.comparable_VS_comparator;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
  int rollno , age;
  String name;
  Student(Integer rollno, String name ,Integer age){
     this.rollno = rollno;
     this.age = age;
     this.name = name;
  }

  @Override
  public int compareTo(Student object1) {// Here we are concern about age

    if(age == object1.age) return 0; // return 0 => leave it as-it-is[Not necessary to worry about]

    else if(age > object1.age) return 1; // return 1 => put it on top

    else return -1; // return -1 => put it on bottom

  }
  /*
  *Since we need atleast 2 objs to compare here only one arg
  *Since compareTo is a method of class
  *(we create an obj which will be one of its arg) */
 }
//----------------------------------------------------------

class sort{
 public static void main(String[] args) {
  ArrayList<Student> ary = new ArrayList<Student>();
  ary.add(new Student(67,"Nathamuni",19));//Adding by creating object with reference to Student[Constructor]
  ary.add(new Student(25,"Raja",55));
  ary.add(new Student(45,"Raman",50));
  ary.add(new Student(49,"Krishna",37));
  ary.add(new Student(60,"Sanjay",12));
  ary.add(new Student(31,"Hari",24));
  Collections.sort(ary);
  for(Student st : ary)
   System.out.println(st.rollno+ " "+st.name +" " +st.age);
 }
}
 package com.This_keyword;

 class Student1{
    int rollno;
    String name;
    float fee;
  Student1(int rollno,String name,float fee){
     rollno=rollno;// since the jvm dosen't know about which variable to asign
     name=name;
     fee=fee;
  }
  void display(){
   System.out.println(rollno+" "+name+" "+fee);
  }

   public static void main(String args[]){
     Student1 s1=new Student1(111,"Nathamuni",5000f);
     Student1 s2=new Student1(110,"thiru",6000f);
     s1.display();
     s2.display();
    }
 }

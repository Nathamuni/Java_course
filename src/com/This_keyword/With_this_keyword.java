package com.This_keyword;

    class Student{
        int rollno;
        String name;
        float fee;
        Student(int rollno,String name,float fee){
            this.rollno=rollno;// this. here refers to the class variable
            this.name=name;// The most common use of this keyword is to eliminate the confusion
            this.fee=fee;// between class attributes and parameters with the same name
        }
        void display(){
            System.out.println(rollno+" "+name+" "+fee);
        }


        public static void main(String args[]){
            Student s1=new Student(67,"Nathamuni",5000f);
            Student s2=new Student(110,"Thiruvenkadam",6000f);
            s1.display();
            s2.display();
        }

    }

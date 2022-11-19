package com.Map;
import java.util.HashMap;
public class Hashmap {

    public static void main(String[] args) {
        HashMap<Integer,String> emp = new HashMap<>();
        emp.put(1,"Nathamuni");
        emp.put(2,"hari");
        emp.put(3,"ram");
        emp.put(4,"thiru");
        emp.put(5,"venu");
        emp.put(6,"raja");
        System.out.println("Employee HashMap : "+emp);

        HashMap<Integer,String> duplicate = new HashMap<>();

       duplicate.putAll(emp);


        System.out.println("Duplicate HashMap : "+duplicate);
        duplicate.clear();
        System.out.println("Duplicate HashMap : "+duplicate);

        System.out.println("containsKey : "+emp.containsKey(3));

        System.out.println("containsValue : "+emp.containsValue("thiru"));

        System.out.println("Cloned copy : "+emp.clone());
// clone returns a shallow copy of that object
        System.out.println(emp.isEmpty());

        System.err.println(emp.get(1));

        System.out.println("All key SET : "+emp.keySet());   //returns all keys

        System.out.println("All Values  : "+emp.values());   //returns all Values

        System.out.println("Retrive all key value pair : "+emp.entrySet());
//        In Map the Key-Value pair is called "ENTRY"

        System.out.println(emp.replace(4,"namu"));

        System.out.println(emp.entrySet());

    }
}

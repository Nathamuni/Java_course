package com.Map;
import java.util.TreeMap;


public class Treemap {
    public void TreemapExample(){
        //Creating object
        TreeMap<String,String> Treemap =new TreeMap<>();
        Treemap.put("Thiruvarumbur", "trichy ");
        Treemap.put("Srirangam", "trichy");
        Treemap.put("Palakarai", "trichy");
        Treemap.put("Kallukzhi", "trichy");
//alphabetical(ASCII) value
        System.out.println("Elements are sorted on ascending order :"+ Treemap);

        TreeMap<String,String> duplicate = new TreeMap<>();

        duplicate.putAll(Treemap);

        System.out.println("Duplicate Treemap : "+duplicate);
        duplicate.clear();
        System.out.println("Duplicate Treemap : "+duplicate);

        System.out.println("Treemaployee Treemap : "+Treemap.containsKey("Srirangam"));

        System.out.println("Treemaployee Treemap : "+Treemap.containsValue("Nathamuni"));

        System.out.println("Cloned copie : "+Treemap.clone());

        System.out.println(Treemap.isEmpty());

        System.out.println(Treemap.get("Kallukzhi"));

        System.out.println("All key SET : "+Treemap.keySet());   //returns all keys

        System.out.println("All Values  : "+Treemap.values());   //returns all Values

        System.out.println("Retrive all key value pair : "+Treemap.entrySet());
//        In Map the Key-Value pair is called "ENTRY"

    }


    public static void main(String[] args) {

        Treemap TreemapExample= new Treemap();
        TreemapExample.TreemapExample();
    }
}

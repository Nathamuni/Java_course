package com.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args){
        LinkedHashMap<String,String> heros =new LinkedHashMap<>();
        heros.put("Iron Man", "Tony Stark");
        heros.put("Bat Man", "Bruce Wayne");
        heros.put("^tain America", "Steve");
        heros.put("Legend", "Nathamuni");
        System.out.println(heros);

        System.out.println("\nHere order is maintained\n");

        HashMap<String,String> heros1 =new HashMap<>();
        heros1.put("Iron Man", "Tony Stark");
        heros1.put("Bat Man", "Bruce Wayne");
        heros1.put("^tain America", "Steve");
        heros1.put("Legend", "Nathamuni");
        System.out.println(heros1);
    }
}

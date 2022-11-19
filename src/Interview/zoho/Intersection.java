package Interview.zoho;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();

        int [] arr1={1,12,3,4,5,6,7,8,9};
        int [] arr2={1,2,8,9,45,67,89,10};
        //toreturn the n.o of intersecting numbers
        int count =0;
        for(int i : arr1){
            ar.add(i);
        }
        for(int i : arr2){
            if(ar.contains(i)) {
                count++;
                ar.remove(i);
            }
        }
        System.out.println(count);
    }
}

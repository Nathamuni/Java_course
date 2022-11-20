package Interview.zoho;

import java.util.*;

public class Max_Min_Max {
//    Modify an array such that every element  should be greater than prev and next .
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
//        arr.add(6);
        Max_Min_Max m = new Max_Min_Max();

        System.out.println(m.modify(arr));

    }
    public ArrayList<Integer> modify(ArrayList<Integer> arr){
        ArrayList<Integer> a = new ArrayList<>();
        int size = arr.size();
        for(int i=0; i<size;i++){
            if(i%2==1){
                int min = findMin(arr);
                a.add(min);
                arr.remove(arr.indexOf(min));
            }
            else{
                int max = findMax(arr);
                a.add(max);
                arr.remove(arr.indexOf(max));
            }
        }
        return a;
    }

    public int findMin(ArrayList<Integer> a){
        int min = a.get(0);
        for(int i=0;i< a.size();i++)
            min = Math.min(a.get(i),min);
    return min;
    }
    public int findMax(ArrayList<Integer> a){
        int max = a.get(0);
        for(int i=0;i< a.size();i++)
            max = Math.max(a.get(i),max);
        return max;
    }
}

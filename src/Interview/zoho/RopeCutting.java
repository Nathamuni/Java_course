package Interview.zoho;

import com.Map.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*You are given N ropes. A cut operation is performed on ropes
such that all of them are reduced by the length of the smallest rope.
 Display the number of ropes left after every cut operation until the length of each rope is zero.*/
public class RopeCutting {
    static int ip[] ={5, 1, 1, 2, 3, 5} ;
    public static void main(String[] args) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        // hs
        // 5 -2  3 -1,  2 -1,  1 -2
        for (int i : ip) {
            if (hs.containsKey(i)) hs.put(i, hs.get(i) + 1);
            else
                hs.put(i, 1);
        }

        //output 4 3 2
        //int outarr[] = new int[ip.length];
        ArrayList<Integer> outarr = new ArrayList<>();
        int min;
        min = findmin(ip);
        int max,flag=0;
        int len = ip.length;
        while(hs.keySet().size()>1){
        for (int val : hs.keySet()) {
             max = findmax(hs.keySet());
            int low = max - min;

            if (val > low) {
                flag =1;
                outarr.add(len - hs.get(val));
                len = len - hs.get(val);
                hs.remove(max);
            }
        }if(flag ==0)
            min-=1;

    }
        for(int k : outarr){
            System.out.println(k);
        }
    }

    private static int findmin(int [] ip) {
        int min = Integer.MAX_VALUE;
        for(int i : ip){
           min = Math.min(i,min);
        }
        return min;
    }
    private static int findmax(Set hs) {
        int max = Integer.MIN_VALUE;
        for(var i : hs){
            if(max < (int)i) max = (int)i;
        }
        return max;
    }
}

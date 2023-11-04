package Interview.MallowTech;

import java.util.*;

public class FreqOfCharInString {
    public static void main(String[] args) {
        //Thisisasamplestring
        String s = "thisisasamplestring";
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
//        TreeMap<Character, Integer> hs = new TreeMap<>();
        int[] arr = new int[26];
        for (char c : ch) {
            int x = (int)c-97;
            arr[x] +=1;
        }
        int ind;
        for(int i=0 ; i< arr.length; i++){
            int max =0;ind=0;
            for(int j=0; j<arr.length;j++) {
                if (arr[j] > 0 && max < arr[j]) {
                    max = arr[j];
                    ind = j;
                }
            }
            if(arr[ind]>0) {
                System.out.println((char) (ind + 97) + " - " + arr[ind]);
                arr[ind] = 0;
            }
        }
       /* System.out.println(hs.entrySet());
        char value=' ';


        for(int i=0; i<hs.size() ; i++)
        for(char c : hs.keySet()){
            int max = hs.get(c);
            for(char ca : hs.keySet()){
                if(max< hs.get(ca)){
                    value = ca;
                    max = hs.get(ca);
                }
            }
            System.out.println(value +" - "+hs.get(value));
            hs.remove(value);
        }*/
    }
}
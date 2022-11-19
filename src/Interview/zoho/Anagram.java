package Interview.zoho;

import java.util.HashMap;

public class Anagram {
    // cat ,act
HashMap<Character,Integer> hs = new HashMap<>();

    public static void main(String[] args) {
        Anagram ana = new Anagram();
        System.out.println(ana.fun("cat","act"));
    }

    public boolean fun(String a,String b){
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        for(char c : arr1){
            if(hs.containsKey(c)) {
                hs.put(c,(hs.get(c)+1));
            }else hs.put(c,1);
        }
        for(char c : arr2){
            if(hs.containsKey(c) && hs.get(c) != 0) {
                hs.put(c,hs.get(c)-1);
            }else return false;
        }
        return true;
    }
    //or we can simply sort those arrays and use Arrays.equals(arr1, arr2)
    //then use arr1.equals(arr2)
}

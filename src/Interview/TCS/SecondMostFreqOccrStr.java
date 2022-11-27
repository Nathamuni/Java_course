package Interview.TCS;

import java.util.HashMap;
import java.util.HashSet;

public class SecondMostFreqOccrStr {
    public static void main(String[] args) {
        String []s = {"aaa","bbb","ccc","bbb"};
        System.out.println(secFreqEle(s));
    }

    private static String secFreqEle(String[] s) {
        HashMap<Integer,String> hs = new HashMap<>();
        int max=0,SecondMax=0;
        String out="";

        for(int i=0; i< s.length;i++) {

            int count=0;

            for(int j=i; j< s.length;j++) {
                if(s[i].equals(s[j]))
                    count++;

            }
            hs.put(count, s[i]);

        }
        return  out;
    }
}

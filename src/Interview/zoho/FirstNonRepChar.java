package Interview.zoho;

import com.nathu.project1.Main;
import java.util.*; 
public class FirstNonRepChar {
    public static void main(String[] args) {
        String s = "asdfsda";
        char c [] = s.toCharArray();
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0; i<c.length;i++){
            if(hs.containsKey(c[i])) hs.put(c[i],(hs.get(c[i]))+1);
            else hs.put(c[i],1);
        }
        for(var i : hs.keySet()){
            if(hs.get(i) ==1) {
                System.out.println(i);
                return;
            }
        }

    }
}

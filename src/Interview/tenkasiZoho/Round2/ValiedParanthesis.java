package Interview.tenkasiZoho.Round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ValiedParanthesis {
    public static void main(String[] args) {
        String s = "([{)(}[[]]{()}])";
        ArrayList<Character> arr = new ArrayList();
        HashMap<Character,Character> hs = new HashMap();
        hs.put('[',']');
        hs.put('{','}');
        hs.put('(',')');
        char[] c = s.toCharArray();
        for(var v : c){
            if(arr.size()>0 &&
            hs.get(arr.get(arr.size()-1))!=null  &&
            hs.get(arr.get(arr.size()-1)) == v)
                arr.remove(arr.size()-1);

            else arr.add(v);

        }
        if(arr.isEmpty()) System.out.println(true);
        else System.out.println(false);
    }
}

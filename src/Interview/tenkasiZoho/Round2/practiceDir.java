package Interview.tenkasiZoho.Round2;

import java.sql.Array;
import java.util.ArrayList;

public class practiceDir {
    public static void main(String[] args) {
        String s = "/a/b/../.././././c/./d";
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) != '/'){
                if(s.charAt(i)=='.' && (arr.size()!=0)  && s.charAt(i+1)=='.'){
                    arr.remove(arr.get(arr.size()-1));
                }
                else if (s.charAt(i) != '.')
                    arr.add(""+s.charAt(i));
            }
        }
        for(var i : arr)
        System.out.print("/"+i);
    }
}

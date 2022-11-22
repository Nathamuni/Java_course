package Interview.TCS;

import java.util.HashMap;

public class SuperAsciiStr {
//    Given a super ASCII code {a = 1 , b = 2,... ,z = 26}

   static  HashMap<Character,Integer> hs = new HashMap<>();
    public static void main(String[] args) {
        for(int i = 97;i<=122;i++){
            hs.put((char)i,i-96);
        }
        System.out.println(SuAss("accbc"));
    }

    private static String SuAss(String s) {
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            String a =s.replaceAll(Character.toString(c),"");
            if(s.length()-a.length() != hs.get(c)) return "No";
        }
        return "Yes";
    }
}

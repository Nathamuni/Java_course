package Interview.TCS;

import java.util.Arrays;
import java.util.HashMap;

public class SuperAsciiStr {
//    Given a super ASCII code {a = 1 , b = 2,... ,z = 26}

   static  HashMap<Character,Integer> hs = new HashMap<>();
    public static void main(String[] args) {
        for(int i = 97;i<=122;i++){
            hs.put((char)i,i-96);
        }
        System.out.println(SuAss("ddeabbddccc"));
    }

//    private static String SuAss(String s) {
//        for (int i=0;i<s.length();i++) {
//            char c = s.charAt(i);
//            String a =s.replaceAll(Character.toString(c),"");
//            if(s.length()-a.length() != hs.get(c)) return "No";
//        }
//        return "Yes";
//    }
private static String SuAss(String s) {
        //better
        char[] ch = s.toCharArray();
          Arrays.sort(ch);

    for (int i=0;i<ch.length;i++) {
        int count =1;
        while(i+1<ch.length && ch[i] == ch[i+1]) {
            count++;
            i++;
        }
        if(ch[i]-96 != count)
            return "No";
    }
    return "Yes";
}
}

package Interview.zoho;

import java.util.HashMap;

public class MapStringChars {
    //to map the alphabets in a string with equally likely other characters

    public static void main(String[] args) {
        boolean b = checkMapping("egg","add");
        System.out.println(b);
    }

    private static boolean checkMapping(String str1, String str2) {
        HashMap<Character,Character> hs = new HashMap<>();
        if(str1.length() == str2.length())
        {
            char c1 [] =str1.toCharArray();
            char c2[] =str2.toCharArray();

            for (int i =0; i<c1.length;i++)
            {
                if(!hs.containsKey(c1[i])){
                    hs.put(c1[i],c2[i]);
                    hs.put(c2[i],c1[i]);

                }
                else if(hs.get(c1[i]) != c2[i])
                    return false;

            }
        }
        return true;
    }

}

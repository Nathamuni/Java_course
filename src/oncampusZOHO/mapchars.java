package oncampusZOHO;

import java.util.HashMap;

public class mapchars {
    public static void main(String[] args) {
        String s="ekg" ,s2="ajj";
        HashMap<Character, Character> hs = new HashMap<Character, Character>();
        if(s.length() != s2.length()) System.out.println(false);
        else
        for(int i=0; i< s.length() ; i++){
            if(hs.containsKey(s.charAt(i)) && hs.get(s.charAt(i)) !=s2.charAt(i)){

                System.out.println(false); return;
            }
            else{
                hs.put(s.charAt(i),s2.charAt(i));
            }
        }
        System.out.println(true);

    }
}

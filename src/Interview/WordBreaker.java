package Interview;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreaker {
   static HashSet<String> hs =new HashSet<>();
    //Leet code (19) blind 75
    /*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
    Note that the same word in the dictionary may be reused multiple times in the segmentation.*/
    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cats");
        wordDict.add("cat");

        System.out.println(wordBreak("catsandog",wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        char[] ch = s.toCharArray();
        for(int i=0; i< ch.length ; i++)
        {
            String s1 = "";
            for(int j=i; j< ch.length ; j++)
            {
               s1 =  s1.concat(String.valueOf(ch[j]));
                hs.add(s1);
            }

        }
        for(int i=0; i< wordDict.size(); i++) {
            if (!hs.contains(wordDict.get(i)))
                return false;
        }
        return true;
    }
}

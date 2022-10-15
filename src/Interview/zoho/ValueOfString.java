package Interview.zoho;
import java.util.*;
public class ValueOfString {
    HashMap<Character,Integer> hs = new HashMap<>();
    String s ="nathamuni";
    char ch[] = s.toCharArray();
    public static void main(String[] args) {
        ValueOfString vos1 = new ValueOfString();
        vos1.addele();
        vos1.print();
    }

    public void addele(){

        int get =0;
        for(char c : ch){
                if(hs.containsKey(c)){
                get = hs.get(c);
                get++;
                hs.put(c, get);
                }else{
                    hs.put(c,1);
                }
        }
    }
    public void print(){
        char c;
        for(int i  : hs.keySet()) {
            System.out.println((char) i+" "+(i-96) * hs.get((char) i));

        }

    }


}

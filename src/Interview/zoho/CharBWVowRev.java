package Interview.zoho;

import java.util.ArrayList;
/*Characters between Vowels - Reverse

The program must accept a string S as tHe input.

For each vowel from right to left in the string. the program must print
the characters between the current vowel(inclusive) and the next
vowel(exclusive).
*/
public class CharBWVowRev {
    static String s = "aeiou";
   static  char []ch = s.toCharArray();
    public static void main(String[] args) {
printstr();
    }
    public static void printstr()
    {
        ArrayList<String> arr = new ArrayList<>();
        String str ="";
        int start =0;
        for(int i=0 ; i<ch.length;i++){
//manager    er ag an
            if(ch[i] == 'a'|| ch[i] == 'e'|| ch[i] == 'i'|| ch[i] == 'o'|| ch[i] == 'u' ||ch[i] == 'A'|| ch[i] == 'E'|| ch[i] == 'I'|| ch[i] == 'O'|| ch[i] == 'U' )
            {
                if(start ==0 )
                {
                    str ="";
                    str = str.concat(String.valueOf(ch[i]));
                    start =1;
                    // used to eliminate non-vowel char in front
                }
                else
                {// execute when flag is 1(i.e when it is 2nd vowel)
                    arr.add(str);
                    str ="";
                    str = str.concat(String.valueOf(ch[i]));//since that vow is inclusive for next word
                }
            }
            else{
                str = str.concat(String.valueOf(ch[i]));
            }
            if(i==ch.length-1 && str.length() >1) // used to add elements which are left at the end
                arr.add(str);
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i));
        }
    }
}

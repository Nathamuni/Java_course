package Interview;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        String s2="";
        String s1 ="this is sample";

        String s = "";
        char [] ch = s1.toCharArray();
        for(int i = ch.length-1;i>=0 ;i-- ){

            if(ch[i] != ' '){
                s =ch[i]+s;
            }
            else {
                s2 = s2+s +' ';
                s="";
            }
        }
        s2 = s2+s;
        System.out.println(s2);
    }

}
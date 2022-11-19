package Interview.zoho;

public class ReciprocalString {
//    given ab C    to return     zy X
public static void main(String[] args) {
    char ch[] = {'a','b',' ','C'};
    char out[] = new char[ch.length];
    int index=0;
    for (int c =0; c< ch.length;c++){
        if(ch[c] != ' ' && (int) ch[c] <= 122 && (int) ch[c] >= 97){
            int i = ch[c];
            i = i-97;
            i = 26-i;
            i+=96;
            out[index++] = (char)(i);
        }else if(ch[c] == ' ')
            out[index++] = ch[c];

        else if((int) ch[c] <= 90 && (int) ch[c] >=65){
            int i = ch[c];
            i = i-65;
            i = 26-i;
            i+=64;
            out[index++] = (char)(i);
        }
    }
    System.out.println(out);
}
}

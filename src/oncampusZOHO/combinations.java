package oncampusZOHO;

import java.util.Arrays;
import java.util.HashSet;

public class combinations {
    public static void main(String[] args) {
        char [] c = {'a','b','c','w'};
        Arrays.sort(c);
        HashSet arr = new HashSet<char[]>();
        String s ="";
        for(int k=0;k<c.length ; k++){
        for(int i=0; i<c.length ; i++){
            for(int j=0; j<c.length ; j++){
//                if(c[i]<c[j]){
                s+=c;
if(s.length()==c.length){

 arr.add(s);s="";
}

//                System.out.println(c);
                char ch = c[i];
                    c[i] = c[j];
                    c[j] = ch;

            }
        }}
        for(var i : arr){
            System.out.println(i);
        }
    }
}

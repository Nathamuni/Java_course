package Interview.tenkasiZoho;

import java.util.ArrayList;

public class directory {
    public static void main(String[] args) {

        String s ="././././../../a/";
        ArrayList<String> arr = new ArrayList<>();
        String s1="";
        char ch [] = s.toCharArray();
        for(int i=0; i<ch.length; i++ ){
            if(ch[i]!='/'){
                if(ch[i]=='.' && ch[i+1]=='.' && arr.size()!=0){
                    arr.remove(arr.size()-1);
                }else if(ch[i] != '.'){
                    s1+=ch[i];
                    arr.add(s1);
                    s1="";
                }
            }
        }

        System.out.println(arr);

        for(String x:arr){
            System.out.print("/"+x);
        }
    }
}

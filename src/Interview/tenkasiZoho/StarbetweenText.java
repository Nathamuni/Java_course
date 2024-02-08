package Interview.tenkasiZoho;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StarbetweenText {
    public static void main(String[] args) {
        String s = "i am good today";
        int len =23;
        char[] c = s.toCharArray();
        String s1="" ;
        int count=0;

        ArrayList<String > arr = new ArrayList<>();
        for(char ch : c){
            if(ch==' '){
                arr.add(s1);
                s1="";
            }else {
                s1 += ch;
                count++;
            }
        }
        arr.add(s1);
        System.out.println(arr+" "+count);

        int space = s.length()-count;// 3

        int star = len-count; //

        int star1 = (int) Math.ceil(1.0 * star / space);
//        System.out.println(star1);

        int temp = star % star1;
//        System.out.println(temp);

        for(int i=0; i<arr.size() ;i++){
            int n=star1;
            if(temp !=0 && i==arr.size()-2)
                n=temp;
            System.out.print(arr.get(i));
            if(i!=arr.size()-1) {
//                System.out.print(" ");
                for (int x = 0; x < n; x++)
                    System.out.print("*");
            }
        }


    }
}

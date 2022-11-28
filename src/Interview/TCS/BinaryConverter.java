package Interview.TCS;

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        int n = 4;
        String ans = "";
        while(n!=0){
            ans = n%2+ans;
            n /=2;
        }
        System.out.println(Integer.valueOf(ans));
    }
}

package Interview.zoho;

import java.util.Scanner;

import static java.lang.Math.*;

public class SQ_pattern {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0 ; i< n*2-1 ; i++ ){
            int k =0;
            for (int j=0 ; j< n*2-1 ; j++ ){

                if (i == 0 || i == n*2-2) {
                    System.out.print(n + " ");
                }
                else {
                    if ( n==k) k=  k +2;// this +2 is when the abs value is 0 the output should be 2
                    System.out.print(abs(n-k) + " ");
                    k= k+1;
                }
            }
            System.out.println();
        }
    }
}

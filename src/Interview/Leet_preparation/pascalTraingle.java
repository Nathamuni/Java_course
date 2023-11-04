package Interview.Leet_preparation;

import java.util.Scanner;

public class pascalTraingle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n==1)
            System.out.println(1);
        for(int i =1; i<=n; i++) {
            for(int j=i;j<=n; j++)
            System.out.print(' ');
            System.out.println((int)Math.pow(11,i));
        }
    }
}

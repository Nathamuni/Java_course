// Draw patterns with *
package Interview;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.printNum();
        System.out.println("---------------------------------");
        p.printStar();
    }

    public void printStar() {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int row, column;
        for (row = 0; row < n; row++) {
            for (column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void printNum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,column;
        for(row=1 ; row<=n ; row++){
            for(column=1; column<=row; column++ ){
                System.out.print(" "+column);
            }
            System.out.println();
        }
    }
}
package Interview.zoho;
import java.util.*;
// To print the values sorted if odd index
// decending if even n.o
public class OddindexEvenindex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lim = scan.nextInt();
        int []array = new int[lim];


        for(int i=0; i<lim;i++){
            System.out.println("Enter "+i+" th element");
                array[i] =(scan.nextInt());
        }
        Arrays.sort(array);
        for(int i=0; i<lim;i++) {
            if (i % 2 != 0) {
                System.out.print(array[lim-(i+1)]);
            }
            else
                System.out.print(array[i]);


        }
    }
}

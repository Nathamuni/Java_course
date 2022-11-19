// Check for the presence of the given number in the array
package Interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ElementToFind {
    int[] arr = {12,34,2,19,87,45,96,3,3,3,102,420,80,65,7};
    boolean search(){
        boolean b = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to search ");
        int a = s.nextInt();
        for(int i =0; i<arr.length; i++){
            if(arr[i] == a){
                b = true;
                System.out.println("Element found ✌");
                break;
            }
        }if(!b) System.out.println("Element not found..!¯\\_(͠◓͜ʖ͠◓ )_/¯");
        return  b;
    }
//    ---------------------------------------------------------------
    public void IntStream(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to search ");
        int a = s.nextInt();
       boolean bol = IntStream.of(arr).anyMatch(element -> element == a);
//       the Stream API is used to process collections of objects.
// A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
       if(bol) System.out.println("Number present.");
       else System.out.println("Not present.");
    }
//    ------------------------------------------------------------
    public static void main(String[] args) {
        ElementToFind obj = new ElementToFind();
       obj.search();
        //obj.IntStream();

    }
}

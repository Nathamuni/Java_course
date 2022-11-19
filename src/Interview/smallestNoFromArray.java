//Find the smallest element from an integer array
package Interview;
import java.util.Arrays;

public class smallestNoFromArray {

    static int []arr = {19,45,32,-14,16,32,-17,12,-11,-5,4,3,7,8,9,-10,88};

    public static void main(String[] args) {
        smallestNoFromArray findMin = new smallestNoFromArray();
        System.out.println("Using comparison ");
        findMin.usingComparison();
        System.out.println("Using arrays.sort method ");
        findMin.ArraySort();
    }
//------------------------------------------------------
    public void usingComparison(){
        int min;
        min = arr[0];
        for(int i=1; i< arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        } System.out.println(min);
    }
//----------------------------------------------------
    public void ArraySort(){
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}

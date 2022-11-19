package Interview.zoho;
import java.util.*;
//Given an array of integers and a key we have to return true if any 2 element sum pu to key
public class KeyPair {
    int arr[] ={1,2,3,4,5,6,7,89};
    public static void main(String[] args) {
        KeyPair kp = new KeyPair();
        System.out.println(kp.check(80));
    }
    public boolean check(int target){
        Arrays.sort(arr);
        int a=0,b=arr.length-1;
        while(b>a){
            if(arr[a]+arr[b] > target)
            {
                b--;
            }
            else if(arr[a]+arr[b] < target){
                a++;
            }
            else return true;
        }
        return false;
    }
}

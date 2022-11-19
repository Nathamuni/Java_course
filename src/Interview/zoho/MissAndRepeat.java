package Interview.zoho;

import java.util.Arrays;

public class MissAndRepeat {

    // to print the num which is repeating and missing number limit (1 - n)
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,6,7,8,9};
        find(arr);
    }
    static void find(int a[]){
        int repeating=0;
        Arrays.sort(a);
        int missing=0;
        for(int i =0; i< a.length;i++){
            if(a[i] != i+1) {
                missing =i+1;
                repeating = a[i];
                break;
            }
        }
        System.out.println("Missing :"+ missing +" \nRepeating :"+repeating);
    }
}

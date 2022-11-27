package Interview.TCS;

import java.util.Arrays;
import java.util.Collections;

public class SortHalfAscDes {
    private static int[] arr1;

    public static void main(String[] args) {
        int []a = {10,20,30,40};
        customSort(a,a.length);
    }
    static void customSort(int[] arr, int n) {
//if odd number split like floor
        int s1 = n/2;
        int s2 = n-(s1);
        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
//        for(int i =0; i< s1 ; i++) {
//            for (int j = 0; j < s1; j++) {
//                if(arr[i]<arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int i =s1; i< n ; i++){
//            for(int j=s1;j<n ;j++)
//            {
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }

        for(int i=0;i<n;i++){
            if(i<s1) arr1[i] = arr[i];
            else arr2[i-s1] = arr[i];
        }
        Arrays.sort(arr1);Arrays.sort(arr2);

        for(int a: arr1) System.out.print(a+" ");
        for(int i=arr2.length-1; i>=0;i--) System.out.print(arr2[i]+" ");
    }
}

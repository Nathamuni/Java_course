package Interview.MallowTech;

import java.util.Arrays;

public class zigzagSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        sort(arr,arr.length);
    }
    public static  void sort(int arr[],int s){
        for(int i=0; i< s-1 ; i++){
           if(i%2==0 && arr[i] > arr[i+1]){
               int t = arr[i];
               arr[i]= arr[i+1];
               arr[i+1]= t;
           }
           else if(i%2==1 && arr[i] < arr[i+1]){
               int t = arr[i];
               arr[i]= arr[i+1];
               arr[i+1]= t;
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}

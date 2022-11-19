package com;
import java.util.*;
class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size] ;
        for(int i=0; i< size;i++)

            arr[i] = scan.nextInt();

        System.out.println(max(arr,size));
    }
    public static int max(int [] arr,int size){
        int a,b,maxi=a=b=0;
        for(int i=1; i< size;i++){
            a=arr[i-1];
            b=arr[i];
            if((a+b) > maxi){
                maxi = a+b;
            }
        }
        return maxi;
    }
}
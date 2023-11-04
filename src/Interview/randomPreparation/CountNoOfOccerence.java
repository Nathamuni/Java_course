package Interview.randomPreparation;

import java.util.Arrays;

public class CountNoOfOccerence {
//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    //to find the number of target elements present in the sorted array

    static int[] a = new int[2];
    public static void main(String[] args) {
        int arr[] ={0,1,3,4,5,5,7,8,9};
        int target = 7;
        System.out.println(Arrays.toString(BinarySearch(arr, 0, arr.length-1, target)));
    }
    static int start;static int end; static int Final;
    private static int[] BinarySearch(int[] arr, int min, int max, int target) {
        int mid = (min+max)/2;

        if(min >= max && arr[mid] != target)
            return new int[] {-1,-1};
        else
        {
            if(arr[mid] == target){
                Final = mid;
                start = mid;
                end = mid;
                return new int[]{
                        a[1] =FindBoundary2(arr, 0, mid, target),
                        a[0] =FindBoundary1(arr, mid, arr.length-1, target)
                };
            }

            else if(arr[mid]>target){
                max=mid-1;
                BinarySearch(arr, min,max,target);
            }

            else if(arr[mid]<target){
                min = mid+1;
                BinarySearch(arr, min,max,target);
            }
            if(min >= max && arr[mid] != target)
                return new int[] {-1,-1};
            else{
                Final = mid;
                start = mid;
                end = mid;
                return new int[]{
                        a[1] =FindBoundary2(arr, 0, mid, target),
                        a[0] =FindBoundary1(arr, mid, arr.length-1, target)};
            }

        }
    }
    private static int FindBoundary2(int[]arr ,int min, int max, int target){

        if(min >= max){
            if(arr[min] == target)
                end  = min;
                return end;
        }
        else
        {
            int mid = (min+max)/2;

            if(arr[mid]== target){
                end = mid;
                FindBoundary2(arr,mid+1,max,target);
            }
            else if(arr[mid]> target)
                FindBoundary2(arr,min,mid-1,target);
            return end;
        }
    }
    private static int FindBoundary1(int[]arr ,int min, int max, int target){

//        if(min >= max)
//            return start;
        if(min >= max){
            if(arr[min] == target)
            start =  min;
            return start;
        }
        else
        {
            int mid = (min+max)/2;
            if(arr[mid]== target){
                start = mid;
                FindBoundary1(arr,min,mid-1,target);
            }
            else if(arr[mid]< target )
                FindBoundary1(arr,mid+1,max,target);
            return Final;
        }
    }

}

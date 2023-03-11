package Interview.randomPreparation;

import java.util.Arrays;
import java.util.HashSet;

public class PartitionEqualSubsetSum {
    //https://leetcode.com/problems/partition-equal-subset-sum/
    public static void main(String[] args) {
        int sum=0;
        int [] arr = new int[]{14,9,8,4,3,2};
        for (int i :arr) {
            sum+=i;
        }
        System.out.println(findIt(arr,sum));
        System.out.println(optimalFind(arr));
    }

    private static boolean findIt(int[] arr,int sum) {
        int cursum=0;
        for(int i=0; i< arr.length-1;i++){
            cursum=0;
            for(int j=i+1; j< arr.length;j++){
                cursum+=arr[j];
                if(sum-cursum == cursum)
                    return true;
            }
        }
        return false;
    }
    private static boolean optimalFind(int[] arr) {
        int sum1 = 0, sum=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i< arr.length ; i++){
            sum+=arr[i];
//            hs.add(sum1);
            hs.add(arr[i]);

            for(int j=i+1;j<arr.length;j++){
                hs.add(arr[j] + arr[i]);
                for(int k=0;k<arr.length ; k++){
                    hs.add(arr[k] + arr[i]);
                }
            }


        }
        System.out.println(hs);
        return hs.contains(sum/2);
    }
}

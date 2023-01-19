package Interview.randomPreparation;

public class PartitionEqualSubsetSum {
    //https://leetcode.com/problems/partition-equal-subset-sum/
    public static void main(String[] args) {
        int sum=0;
        int [] arr = new int[]{14,9,8,4,3,2};
        for (int i :arr) {
            sum+=i;
        }
        System.out.println(findIt(arr,sum));
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
}

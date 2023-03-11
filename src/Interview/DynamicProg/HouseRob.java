package Interview.DynamicProg;

public class HouseRob {
    // here first and the last house are adjcent
    public static void main(String[] args) {
        int a[] = {1,3,4,2,3,6,3,2,5,2};
        System.out.println(maxSum(a,a.length-2));
    }

    private static int maxSum(int[] a,int index) {
        if (index<1){
            return Math.max(a[a.length-1],a[0]);
        }
            int A = a[index] + maxSum(a, index - 2);
            int B = 0 + maxSum(a, index - 1);
            return Math.max(A, B);

    }
}

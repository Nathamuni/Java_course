package Interview.DynamicProg;
// n ELEMENTS IN AN ARRAY FIND THE MAX SUM FROM THE ARRAY NO ADJ ELEMENTS SHOULD BE PICKED
public class MaxOutputWithoutAdjEle {
    public static void main(String[] args) {
        int [] A = {9,6,3,4,57,9};
        int arr[] = new int[A.length];
        System.out.println(sum(A,A.length-1));

        System.out.println(sum2(A,A.length-1,arr));

        System.out.println(sum(A,A.length-1));
    }
// recurrence solution
    private static int sum(int[] a,int index) {
        if(index == 0)
            return a[index];
        if(index<0) return 0;
        int pick = a[index] +sum(a,index-2);
        int notPick = 0 + sum(a, index-1);
        return Math.max(pick,notPick);

    }
// Memoization (top down using array)
    private static int sum2(int[] a,int i,int []arr) {
        if(i<0) return 0;
        if(i == 0)
            return a[i];
       //if(arr[i]!=0) return arr[i];
        int pick = a[i] +sum2(a,i-2,arr);
        int notPick = 0 + sum2(a, i-1,arr);
        return arr[i] = Math.max(pick,notPick);

    }
    //with constant memory space
    private static int sum3(int[] a,int i) {
        int prev,pprev,cur=0;
        cur = a[i];
        prev =a[i-1];
        pprev =a[i-2];
        if(i<0) return 0;
        if(i == 0) {
            return cur;
        }
        int pick = cur +sum3(a,pprev);
        int notPick = 0 + sum3(a, prev);
        return cur = Math.max(pick,notPick);

    }

}


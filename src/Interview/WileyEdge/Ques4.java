package Interview.WileyEdge;
/*You are given an array, You have to choose a contiguous subarray of length ‘k’,
and find the minimum of that segment, return the maximum of those minimums.*/

/*
* 1 → Length of segment x =1
5 → size of space n = 5
1 → space = [ 1,2,3,1,2]

*/
public class Ques4 {
    public static void main(String[] args) {
        int seg=3;
        int n=5;
        int a[]={1,2,3,1,2};
        int sum=0;
        int max=0;
        for(int i=0; i<seg; i++) max=sum+=a[i];
        int j=0;
        for(int i=seg; i<n; i++){
           max= Math.max(max ,sum-a[j]+a[i] );
           sum = sum-a[j]+a[i];
            j++;
        }
        System.out.println(max);
    }
}

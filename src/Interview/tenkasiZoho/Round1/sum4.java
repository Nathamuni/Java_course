package Interview.tenkasiZoho.Round1;

public class sum4 {
    public static void main(String[] args) {
        int a[]={0,3,2,1};
        System.out.println(zoho(a,7));
    }

    public static int zoho(int[] A, int target) {
    int low = 0, high = A.length-1;
    while(low<=high) {
        int mid = (low + high) / 2;

        if (A[mid] == target) return mid;
        else if (A[mid] > target) high = mid - 1;
        else low = mid + 1;
    }
        return low;
    }
}

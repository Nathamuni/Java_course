package Interview.tenkasiZoho.Round1;

public class sum3 {
//    Input: arr —

    public static void main(String[] args) {
        int arr[] = {0,3,2,1};
        System.out.println(zoho(arr));
    }
    public static boolean zoho(int[] arr) {
            if(arr.length < 3) return false;
        int l=0;
        int r = arr.length- 1;
        while(l + 1 < arr.length - 1 && arr[l]< arr[l+1]) l++;
        while(r-1 > 0 && arr[r] < arr[r- 1])r--;
        return l== r;
}
}

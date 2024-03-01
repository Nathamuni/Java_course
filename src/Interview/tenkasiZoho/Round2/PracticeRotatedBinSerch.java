package Interview.tenkasiZoho.Round2;

public class PracticeRotatedBinSerch {
    public static void main(String[] args) {
        int []a ={9,10,11,21,32,41,51,6};
        int target =9;
        int l=0,r=a.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(a[mid] ==target) {
                System.out.println("target at index "+mid);
                return;
            }
            else if(a[l] <= a[mid]){
                if(target < a[mid] && a[l] <= target){
                    r=mid-1;
                }else l=mid+1;
            }
            else if(a[mid] <= a[r]){
                if(target > a[mid] && a[r] >= target){
                    l=mid+1;
                }else r=mid-1;
            }
        }
        System.out.println(false);
    }
}

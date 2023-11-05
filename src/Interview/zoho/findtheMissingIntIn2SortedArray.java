package Interview.zoho;

public class findtheMissingIntIn2SortedArray {
    public static void main(String[] args) {
    int []a = {1,2,3,4,6};
    int []b = {1,2,3,4};
        System.out.println(find(a,b));
    }

    private static int find(int[] a, int[] b) {
        int i=0 , j=b.length-1;
        int mid=0;
        while(i<=j){
            mid = i+j/2;



            if(i==b.length-1 && a[i+1]==b[i]){
                return a[i];
            }else if(i==b.length-1){
                return a[i+1];
            }



            if(a[mid]==b[mid])
                i=mid+1;
            else if(a[mid] != b[mid])
                j= mid-1;

//            if(i==b.length-1){
//                if(a[i]==a[j]) return a[i];
//                else
//                return a[i+1];
//            }
        }
        return a[i];
    }

}

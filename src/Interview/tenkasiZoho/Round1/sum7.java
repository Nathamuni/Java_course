package Interview.tenkasiZoho.Round1;

public class sum7 {
    public static void main(String[] args) {


        int arr[] = {1,3,7,11};
        for(int i=0;i<arr.length; i++){
            int l=0, h=arr.length-1,
                    target = 2 * arr[i];
            while (l<=h){
                int mid =  l + (h-l)/2;
                if(arr[mid] == target && mid != i){
                    System.out.println("true");
                    return;
                }
                if(arr[mid] < target)
                    l = mid+1;
                else
                    h = mid-1;
            }

        }
        System.out.println(false);
        return;
    }
}

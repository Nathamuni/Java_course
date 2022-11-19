package Interview.zoho;

public class NumDivBy3 {

    public static void main(String[] args) {
        int arr[]={40, 50, 90};
        System.out.println(isPossible(arr.length,arr));
    }
    static int isPossible(int N, int arr[]) {
        int sum =0;
        for (int i:arr) {
            while(i!=0){
                sum += i%10;
                i /= 10;
            }
        }
        if(sum % 3==0) return 1;
                else return 0;
    }
}

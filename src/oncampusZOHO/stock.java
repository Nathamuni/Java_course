package oncampusZOHO;

public class stock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(callme(arr));
    }

    private static int callme(int[] arr) {
        int profit =0;
//        int n= arr[0];
        int min= arr[0];
        int max=0;
        for(int i=0; i<arr.length ; i++){
            max=Math.max(max,arr[i]);
            profit = Math.max(profit,max-min);
            min = Math.min(min,arr[i]);
        }
        return profit;
    }
}

package Interview.randomPreparation;
// He will never rob 2 nearby houses
public class HouseRobber   {
    public static void main(String[] args) {
        int arr [] = {1,1,1,2};
        System.out.println(TotalVarumaanam(arr));
    }


    public static int TotalVarumaanam(int[]arr){
        int sum=0;
        if(arr.length ==1)
            sum = arr[0];
        else if(arr.length ==2)
            sum = Math.max(arr[0],arr[1]);
        else {
            for (int i = 1; i < arr.length ; i++) {
//                sum += Math.max(arr[i - 1] + arr[i + 1], arr[i]);
                if(arr[i] == arr.length-1)
                    sum += arr[i+1];
                else if(i< arr.length-1 && arr[i - 1] + arr[i + 1]> arr[i]) {
                    sum += arr[i - 1] + arr[i + 1];
                    i+=2;
                }
                else{
                    sum += arr[i];
                    i++;
                }
            }
        }
        return sum;
    }
}

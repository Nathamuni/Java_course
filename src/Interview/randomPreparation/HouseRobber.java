package Interview.randomPreparation;
// He will never rob 2 nearby houses
public class HouseRobber   {
    public static void main(String[] args) {
        int arr [] = {1,1,1,1};
        System.out.println(TotalVarumaanam(arr));
    }


    public static int TotalVarumaanam(int[]arr){
        int sum=0;
        if(arr.length ==1)
            sum = arr[0];
         else if(arr.length ==2)
            sum = Math.max(arr[0],arr[1]);
        else {
            for (int i = 1; i <= arr.length ; i++) {
//                sum += Math.max(arr[i - 1] + arr[i + 1], arr[i]);

                 if(i == arr.length){
                    sum += arr[i-1];
                }

                 else if(i == arr.length-1) {
                    if(arr[i] > arr[i-1]){
                        sum+= arr[i];
                    }
                    else sum += arr[i-1];
                }
//
//                  else if( arr[i] + arr[i+2] > arr[i-1] + arr[i+1]){
//                    sum += arr[i] + arr[i+2];
//                    i+=4;
//                }
                 else if( (arr.length %2 ==0 || i < arr.length-3) && arr[i] + arr[i+2] >= arr[i-1] + arr[i+1])
                 {
                      if( ( arr[i] + arr[i+2]< Math.max(arr[i-2] + arr[i+1] , arr[i-1] + arr[i+2]) && (i >1)))
                     {
                         sum += Math.max(arr[i-2] + arr[i+1] , arr[i-1] + arr[i+2]);
                         i+=3;
                     }else{

                     sum += arr[i] + arr[i+2];
                     i+=4;
                 }
                 }
                 else if( (arr.length %2 ==0 || i < arr.length-3)&& arr[i] + arr[i+2] < arr[i-1] + arr[i+1])
                 {
                     if( ( arr[i] + arr[i+2]< Math.max(arr[i-2] + arr[i+1] , arr[i-1] + arr[i+2]))){
                         sum += Math.max(arr[i-2] + arr[i+1] , arr[i-1] + arr[i+2]);
                         i+=2;
                     }
                     sum += arr[i-1]+arr[i+1];
                     i+=3;
                 }

//                 else if( (arr.length %2 ==0 || i < arr.length-3)&& (i >1))
//                 {
//                     sum += Math.max(arr[i-2] + arr[i+1] , arr[i-1] + arr[i+2]);
//                     i+=3;
//                 }
                else if( (arr.length %2 ==0 || i < arr.length-3) && i==1 )
                 {
                     sum += arr[i] + arr[i+2];
                     i+=4;
                 }



                 else if(arr.length %2 ==1 && i < arr.length-1)
                 {
                     sum += Math.max(arr[i-1] + arr[i+1],arr[i]);
                     break;
                 }
            }
        }
        return sum;
    }
}

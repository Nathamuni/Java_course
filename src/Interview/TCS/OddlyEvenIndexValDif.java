package Interview.TCS;

public class OddlyEvenIndexValDif {
    public static void main(String[] args) {
        int arr[] ={9,8,3,4,6,9,1,2,3};
       // int oddSum,evenSum=oddSum=0;
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            if(i%2==0) sum+=arr[i];
            else sum-=arr[i];
        }
        System.out.println(Math.abs(sum));
    }

}

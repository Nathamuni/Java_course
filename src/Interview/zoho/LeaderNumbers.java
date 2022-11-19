package Interview.zoho;

public class LeaderNumbers {
    /*To return an array for which elements on right side
    are not grater (called leader numbers)*/

    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int[] outputarr  = new int[arr.length];
        int max=0,count=0,i;
        for( i=arr.length-1; i>= 0; i--){
            if(arr[i]>max) {
                outputarr[count++] = arr[i];
                max = arr[i];
            }
        }
        System.out.println("The leader n.os in the array are: ");
        for( i=0; i<count; i++){// can get left to right by changing limits
            System.out.print(outputarr[i]+" ");
        }
    }
}

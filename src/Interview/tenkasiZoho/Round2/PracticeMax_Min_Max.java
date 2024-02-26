package Interview.tenkasiZoho.Round2;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeMax_Min_Max {

    public static void main(String[] args) {
        int arr[] = {1,4,2,30,5,8,13};
        System.out.println(Arrays.toString(IConvert(arr)));
        System.out.println(Arrays.toString(inPlace(arr)));
    }
    // ======================================================

    public static int [] inPlace(int a[]){
        for(int i=0; i< a.length ; i++){
            int max=a[i];
            int min=a[i];
            for(int j=i+1; j< a.length ; j++) {
                if(i%2==0 && a[j]>max){
                    int temp = a[i];
                    max = a[i]=a[j];
                    a[j]=temp;

                }if(i%2==1 && a[j]<min){
                    int temp = a[i];
                    min = a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        return a;
    }
    // ======================================================
    public static int [] IConvert(int arr[]){

        ArrayList<Integer> a = new ArrayList<>();
        for(var z : arr) a.add(z);

        int[] out = new int[arr.length];


        for(int i=0; i < out.length ; i++){
            if(i%2 == 0) {
                out[i] = maxz(a);
//                a.remove(a.indexOf(out[i]));
            } else {
                out[i] = mini(a);
//                a.remove(a.indexOf(out[i]));
            }
        }
    return out;
    }

    public static int  maxz(ArrayList arr){
        int max=Integer.MIN_VALUE;
        for(var i : arr){

            if((int)i>max){
                max =(int)i;
            }
        }

        arr.remove(arr.indexOf(max));
        return max;
    }

    public static int mini (ArrayList arr){
        int min=Integer.MAX_VALUE;
        for(var i : arr){
            if((int)i<min) min =(int)i;
        }
        arr.remove(arr.indexOf(min));
        return min;
    }
}

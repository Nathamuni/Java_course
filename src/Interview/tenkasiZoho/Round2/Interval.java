package Interview.tenkasiZoho.Round2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Interval {
    public static void main(String[] args) {
            int a[][]={{1,3},{2,6},{8,10},{15,18}};
//        Arrays.sort(a, Comparator.comparingInt(arr -> arr[0]));

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {

                if(a[j][0] <a[i][0]){
                    int temp = a[i][0];
                    a[i][0] = a[j][0];
                    a[j][0]= temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(a));

        HashMap<Integer,Integer> hm = new HashMap();
            for(int i=0; i<a.length  ; i++){
                int max=0,max1 =0;
                for(int j=i+1; j<a.length ; j++){
                    if(i != j){
                        if(a[i][0]<= a[j][0] && a[i][1] >= a[j][0]){
                            max1= Math.max(a[i][1],a[j][1]);
                            max= Math.max(max,max1);
//                            a[j][1]=-1;
//                            a[j][0]=-1;
                            i++;
                        }
                    }
                }
               // if(a[i][0] != -1) {
                    if (max != 0) {
                        hm.put(a[i][0], max);
                    } else {
                        hm.put(a[i][0], a[i][1]);
                    }
                //}
            }
        System.out.println(hm.entrySet());
    }
}

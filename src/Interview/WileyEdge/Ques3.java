package Interview.WileyEdge;

import java.util.Arrays;

public class Ques3 {
    public static void main(String[] args) {
        int  []a ={3,4,6,6,3};
        while (true) {

        int max = max(a);
        int flag=0;
        for(int i=0; i<a.length ; i++){
            if(max == a[i] && flag ==0){
                flag=1;
            }else a[i]= a[i]+1;
        }
        int t=0;
        for(int x=0;x< a.length-1;){
            if(a[x]==a[x+1] && t==0){
                x++;
            }
            else {
                t=1;break;
            }
        }
            if(t==0){
                System.out.println(Arrays.toString(a));
                return;
        }
    }
    }
    static int max(int[]a){
        int max = Integer.MIN_VALUE;
        for(var i:a)max = Math.max(i,max);
        return max;
    }
}

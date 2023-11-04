package oncampusZOHO;

import java.util.Arrays;

public class minmax {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(a);
        int n= a.length;
        int b[] = new int[n];
        int k=n-1;
        int x=0;
        for(int i =0 ; i<n ; i++){
            if(i%2==0)
            b[i] = a[k--];
            else
                b[i]= a[x++];
        }
        System.out.println(Arrays.toString(b));
    }
}

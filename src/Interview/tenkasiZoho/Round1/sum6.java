package Interview.tenkasiZoho.Round1;

import java.util.Arrays;

public class sum6 {
    public static void main(String[] args) {
        System.out.println(zoho(5));
    }
    static String zoho(int nums){
        int []f = new int[nums+1];

        for(int i=1;i<=nums ; i++){
            f[i]= f[i>>1] +
                    (i&1);

        }return Arrays.toString(f);

    }
}

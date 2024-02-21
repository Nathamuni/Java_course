package Interview.tenkasiZoho.Round1;

import java.util.Arrays;

public class sum8 {

    public static void main(String[] args) {
        int []a={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buitdArray(a)));
    }

    public static int[] buitdArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i< nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
}
}

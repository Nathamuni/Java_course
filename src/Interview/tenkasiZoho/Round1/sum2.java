package Interview.tenkasiZoho.Round1;

import java.util.Arrays;

public class sum2 {
    public static void main(String[] args) {
        int nums[]={ 6,5,4,8};
       // System.out.println(zoho(nums));
        zoho(nums);
    }
    static void  zoho(int nums[]){
        int temp[]= new int [101];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]+=1;
        }
        for(int j=1;j<=100; j++){
            temp[j]+=temp[j-1];

        }
        for(int k=0; k< nums.length ; k++){
            int pos = nums[k];
            nums[k]= pos==0 ? 0 :temp[pos-1];
        }
        System.out.println(Arrays.toString(nums));
//return nums;
    }
}

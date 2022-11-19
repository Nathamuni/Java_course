package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    int a,b;
    List<List<Integer>> arr1 = new ArrayList<>();


    public static void main(String[] args) {
        ThreeSum sol = new ThreeSum();
        int a[] = {-1,0,1,2,-1,-4};
        System.out.println(sol.threeSum(a));
    }
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        //[-3,-2,0,3,5,6]
        for (int i=0; i<nums.length-2;i++)
        {

            a = i+1;
            b = nums.length-1;
            while(a<b)
            {

                List<Integer> arr2 = new ArrayList<>();
//                while(nums[i]==nums[a]) {
//                    a++;
//                    i++;
//                }
//                while(nums[b]==nums[b-1]) b-=1;

                if(nums[i]+nums[a]+nums[b] > 0){
                    b -=1;
                }

                else if(nums[i]+nums[a]+nums[b] < 0){
                    a +=1;
                }


                else if (nums[i]+nums[a]+nums[b] ==0)
                {

                    arr2.add(nums[i]);
                    arr2.add(nums[a]);
                    arr2.add(nums[b]);
                    if(!arr1.contains(arr2))
                        arr1.add(arr2);
                    b--;
                }
            }
        }
        return arr1;
    }
}
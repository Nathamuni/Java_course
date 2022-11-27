package Interview.TCS;

import java.util.HashSet;

//https://practice.geeksforgeeks.org/problems/number-of-open-doors1552/1?company=
public class NumberOfOpenDoors {
    /*
    In the first go, you alter the states of doors numbered 1, 2, 3, , n.
    In the second go, you alter the states of doors numbered 2, 4, 6
    In the third go, you alter the states of doors numbered 3, 6, 9
    */
    public static void main(String[] args) {
        System.out.println(noOfOpenDoors(7L));
    }
/*    static int noOfOpenDoors(Long n) {
        HashSet<Long> hs = new HashSet<>();
        for(long i=1; i<= n ;i++){
            hs.add(i);
        }
        for(long i=2; i<= n ;i++){
            if(n%i ==0 ){
                if(hs.contains(i)) hs.remove(i);
                else hs.add(i);
            }
        }
        return  hs.size();
    }*/
static int noOfOpenDoors(Long n) {
    //doors which are perfect square are only open
    //because they only have odd number of factors
    /*EG
    * 1 -> 1
    * 4 -> 1,2,4
    * 9 -> 1,3,9
    * 16 -> 1,2,4,8,16  ("open","close","open","close","open")
    * */
    int count =0;
    for(int i=1;i<n;i++){
        if(i*i <= n) count++;
        else break;
    }
    return count;
}
}

package Interview.DynamicProg;
// pick | not pick
public class SubsetSumK {
    public static void main(String[] args) {
int[] a = {1,2,3,4,5,6,4,7};
        int i= a.length-1;
        System.out.println(sub(i,9,a))  ;

    }static int sum=0;
    public static boolean sub(int i,int target,int[]a){


        if(0==target){
            return true;
        }
        if(i==0)
            return(a[0]==target);
        boolean notTaken = sub(i-1,target,a);
        boolean Taken = false;
        if(target>=a[i]){
            Taken=sub(i-1,target-a[i],a);
        }
        return (notTaken || Taken);
    }
}

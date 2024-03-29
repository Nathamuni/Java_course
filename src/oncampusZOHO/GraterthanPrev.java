package oncampusZOHO;

public class GraterthanPrev {
    public static void main(String[] args) {
        int a[] ={2,-1,-3,4,7,2,8,9};
        call(a);
    }
    static void call(int a[]){
        int max =Integer.MIN_VALUE;
        for(int i: a){
            if(max<i)
                System.out.println(i+" ");
            max = Math.max(max, i);

        }
    }

}

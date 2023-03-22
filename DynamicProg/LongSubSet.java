package Interview.DynamicProg;

public class LongSubSet {
    static  String s1 ="abbbbbbcmde",s2="9abbcdge";
    public static void main(String[] args) {
        LongSubSet ls = new LongSubSet();
        System.out.println(ls.f(s1.length(),s2.length()));

    }


    private  int f(int i1, int i2) {
        int sum,max=0;
       for(int i=0; i<i1 ; i++){
           sum=0;
           for(int j=0; j<i2 ; j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    i++;
                    sum++;
                }
           }
        max=Math.max(max,sum);
       }
    return max;
    }
}

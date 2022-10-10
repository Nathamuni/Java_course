package Interview.zoho;

public class IsGratestElementTwiceLarge {
    int A[] ={1,3,6,2};
    public  int max(){
        int max = A[0];
        int i,m=0;
        for( i=1; i<A.length;i++){
            if(max < A[i]){
                max = A[i]; m=i;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        IsGratestElementTwiceLarge a = new IsGratestElementTwiceLarge();
        int abc = (a.max());
       System.out.println( a.lessmax(abc));
    }
    public int lessmax(int index)
    {
        int max = A[index];
        int i,lessmax =A[0];

        for( i=1; i<A.length;i++){
            if(lessmax < A[i] && A[i] != A[index]) lessmax = A[i];
        }
        if(max/2 >= lessmax) return index;
        return -1;
    }
}

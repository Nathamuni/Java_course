package Interview.zoho;
// to find the number which is not repeated twice where as all other n.o does
public class NonRepeatingNum {
    public static void main(String[] args) {
        int[] A={1,3,3,1,4,7,8,8,4};
        int result = A[0];
        for(int i =1; i<A.length;i++){
            result ^= A[i];
        }

        System.out.println(result);
    }
}

package Interview.randomPreparation;

public class SumWithoutPlus {
    public static void main(String[] args) {
        int a = 60;
        int b = 1029969876;
        int temp =0;
        String out="";
      long A[] =  findBin(a);
      long B[] =   findBin(b);
      long size = Math.max(A[1],B[1]);
      while(size>=0){
          if(A[0] % 10==1 && B[0] % 10==1) {
              if (temp == 1) {
                  out = 1 + out;
              }
              else{
                  temp = 1;
                  out = 0 + out;
              }

          }
          else if(A[0] % 10==1 && B[0] % 10==0 || A[0] % 10==0 && B[0] % 10==1) {
              if (temp == 1)
                  out = 0 + out;
              else
                  out = 1 + out;
          }
          else {
              if(temp ==1){

                  out= 1 + out;
                  temp =0;
              }
              else
                  out= 0 + out;
          }
          size--;
          A[0] /=10;
          B[0] /=10;
      }
        System.out.println(Long.parseLong(out));
    }
    public static long[] findBin(int a){
        String s ="";
        int count =0;
        while(a>0){
            s = a%2 + s;
            a /= 2;
            count ++;
        }
        long arr[] = new long[2];
        if(s == "")
            arr[0] = 0;
        else
            arr[0] = Long.parseLong(s);
        arr[1] = count;
        return arr;
    }
}

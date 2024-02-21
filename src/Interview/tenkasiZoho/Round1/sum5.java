package Interview.tenkasiZoho.Round1;

public class sum5 {
    public static void main(String[] args) {
        int a[]={1,0,0,0,1};
        System.out.println(z(a,1));
    }
    static boolean z(int[] arr,int n){
        int count = 0;
        for (int i = 0; i <arr.length; i++){
            if(arr[i]==0){
                boolean l = (i==0) ||  (arr[i-1] ==0);
                boolean r = (i ==  arr.length- 1) || (arr[i+1] ==0);
                if(l && r){
                    arr[i] =1;
                    count++;
                }
            }
        }
        return count>=n;

    }
}

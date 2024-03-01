package Interview.tenkasiZoho.Round2;

public class PracticeSecondMaxEle {
    public static void main(String[] args) {
        int a[] ={8,3,1,4,5,6,10,7,9};
        System.out.println(max(a));
        System.out.println(max1(a));
    }
    // ======================================================

    public static int max(int a[]){
        int max=a[0];
        for(int i=1; i< a.length ; i++){
            if(a[i]>max) max= a[i];
        }
       return smax(a,max);
    }
    public static  int smax(int []arr,int max){
        int temp=-1;
        for(int i:arr){
            if(i<max && i>temp){
                temp=i;
            }
        }
        return temp;
    }

    // ======================================================

    public static int max1(int a[]){
        int max=-1,smax=-1;
        for(int i=0;i<a.length ; i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }else if(max>a[i] && smax<a[i]) smax=a[i];
        }
        return smax;
    }
}

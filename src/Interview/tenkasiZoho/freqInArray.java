package Interview.tenkasiZoho;

public class freqInArray {
    //Input : { 1, 1, 2, 2, 2, 3, 3, 3, 4, 5}
    public static void main(String[] args) {
        int []n = { 1, 1, 2, 2, 2, 3, 3 ,4};

        int a= n[0];
        int count=0;
        for(int i=0; i<n.length ; i++){
            int b=n[i];

            if(a !=b ) {
                System.out.print(n[i-1]+"->" + count+", ");
                count=1;
                a=n[i];
            }else {
                count++;
            }
            if(i==n.length-1){
                System.out.print(n[i]+"->" + count);
            }
        }
    }

}

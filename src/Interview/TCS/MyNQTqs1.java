package Interview.TCS;

public class MyNQTqs1 {
//given 'n' number of elements in  an array of rope lengths 'a[]' , max hight he can jump 'm', slip length 's'
//    to find the minimum jumps for reaching top for all ropes combined
    public static void main(String[] args) {
        MyNQTqs1 my = new MyNQTqs1();
        int a[] ={10,9,22,13};
        System.out.println(my.returnMinJump(a.length,10,2,a));
    }
        int returnMinJump(int n, int m, int s , int[] a){
        int count=0;
        for(int i =0; i<n ; i++){
            count += a[i] / (m-s);
//            System.out.println(count);
            if(a[i] % (m-s) > s) count++;
        }
            return count;
        }
}

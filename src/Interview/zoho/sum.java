package Interview.zoho;
// to find the sum of all n.o in an array excluding the odd n.o occur b4 even n.o
public class sum {

    public static void main(String[] args) {
        int  a[] = {4,2,3,6};
        int max=0;
        for (int i=0;i<a.length;i++) {
            if(a[i]%2 != 0 && a[i+1]%2 ==0) continue;
            else max += a[i];
        }
        System.out.println(max);
    }
}

package Interview.tenkasiZoho.Round2;

public class PracticeRotatedBinSerch {

    public static void main(String[] args) {
        int[] a = {9,1, 2 ,3,4,5,6};
        int t = 9;
        System.out.println(callme(a, t));
    }

    private static int callme(int[] a, int t) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;


            if (a[mid] == t) {
                return mid;
            }


            if (a[mid] >= a[i]) {
                if (t < a[mid] && t >= a[i]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (t > a[mid] && t <= a[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }
}

package Interview.zoho;

public class SQRT {
    //Given an integer x, find the square root of x.
    // If x is not a perfect square, then return floor(√x).
    //to find the squire root of a n.o in O(log n)
    // so mwe can use bin search
    public static void main(String[] args) {
        System.out.println(sqrt(10));
    }

    public static int sqrt(int eg) {
        int beg = 1, end = eg, mid = 1;
        int ans =0;
        while (beg <= end) {
            mid = (end + beg) / 2;
            if (mid * mid == eg) return mid;

            else if (mid * mid >= eg) end = mid - 1;

            else{
                beg = mid + 1;
                ans = mid;  // suppose if it is not a perfect sqr it should return the nearest floor sqr n.o
                //by using ans = mid (only when the mid element is lesser)assign mid +1 eachtime
                //if it is not a perfect sqr then it contains exact.....
            }
        }
        return ans ;
    }
}

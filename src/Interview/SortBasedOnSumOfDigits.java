package Interview;
import java.util.*;
public class SortBasedOnSumOfDigits {
    ArrayList<String> arr = new ArrayList<>();
    int array[] = new int[4];

    public static void main(String[] args) {
        SortBasedOnSumOfDigits s = new SortBasedOnSumOfDigits();
        s.sum();
    }
    public void sum(){
        arr.add("11");
        arr.add("12");
        arr.add("43");
        arr.add("51");
int i =0;
        for(String s : arr)
        {
            char []ch;
            ch= s.toCharArray();
            int sum =0;
            for(int c : ch)
            {
                c-=48;
                sum += c;
            }
            array[i++] = sum;
        }
        //Arrays.sort(array);

        for( i=0; i<array.length;i++){
            hs.put(i,array[i]);
        }
        sort(array);

    }
    HashMap<Integer,Integer> hs = new HashMap<>();

    public void sort( int arr[]){

//        for(int i=0; i<arr.length;i++){
//            hs.put(arr[i],i);
//        }
        Arrays.sort(arr);
        int i=0;
        int[] arr1 = new int[4];


        for(int a =0;a<arr.length;a++)
        {
            for (int b =0;b<arr.length;b++){
                if(arr[b]== hs.get(b)) {
                    arr1[a] = hs.get(b);
                }
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}

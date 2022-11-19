package Interview.zoho;
//Given an array push all the zeros to the end of the array
public class PushZerosToEnd {
    int arr [] ={0,1,3,2,8,0,0,9,0,6};
    public static void main(String[] args) {
        PushZerosToEnd Zero = new PushZerosToEnd();
        Zero.swap();
    }
    public void swap(){
        int a = 0 ,temp =0;
        int b = arr.length-1;
        while(a<b){

            while(arr[a] != 0 && a < arr.length-1) a++;
            while(arr[b] == 0 && b > 0) b--;

            if (a < b) { //
                temp = arr[b];
                arr[b] = arr[a];
                arr[a] = temp;
            }

        }
        for(int ele : arr)
        System.out.print(ele+" ");
    }
}

// Reverse a words without reversing each character in it
package Interview;

public class reverse_Sentence {
    public static void main(String[] args) {
        String s = "why is that ";
//        expected out put Nathamuni is This
        String reverse = "";

        String[] temp = s.split(" "); // split is used to split given string with respect to what we had given inside
        // and returns an array of that splitted elements..!


        for(int i = temp.length-1 ; i>=0 ; i--){
            reverse = reverse + temp[i] + " ";
        }
        System.out.println(reverse);

    }
}

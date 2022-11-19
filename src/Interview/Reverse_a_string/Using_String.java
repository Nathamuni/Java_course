package Interview.Reverse_a_string;

public class Using_String {
    public static void main(String[] args) {
        String given = "Nathamuni";
        char[] arr = given.toCharArray();
        String reverse ="";
        for(int i=(arr.length-1) ; i>=0 ; i--){
            reverse = reverse + arr[i];
        }

       /*
        *we can also iterate as normal and add the reverse at the end

        for(int i=0; i<arr.length ; i++){
            reverse =  arr[i] + reverse;
        } */

        System.out.println(reverse);

    }
}

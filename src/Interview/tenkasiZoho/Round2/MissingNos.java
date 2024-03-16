package Interview.tenkasiZoho.Round2;

import java.util.*;

public class MissingNos {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 5, 2};
        int max = arr.length;
        boolean flag = true;
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1, 2, 1, 5, 2)); // Corrected array initialization

        for (int i = 1; i <= arr.length; i++) {
            if (!ar.contains(i)) {
                flag = false;
                System.out.println(i);
            }
        }
        if (flag) {
            System.out.println("No missing numbers");
        }
    }
}

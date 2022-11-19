package Interview.zoho;

public class Kolaru_patten_printing {

    public static void main(String[] args) {
        int a = 5;
        int[][] arr = new int[a][a];
        int i = 0, j = 0, count = a;
        while (i < a && j < a) {
            if (i < (a / 2)) {
                arr[i][j] = count;
                count--;

            } else if (i == (a / 2))
                arr[i][j] = count;

            else {
                count++;
                arr[i][j] = count;
            }
            i++;
            j++;
        }
//=====================================================
        i = 0;
        j = a - 1;
        while (i < a && j >= 0) {
            if (i < (a / 2)) {
                arr[i][j] = i + 1;
            } else if (i > (a / 2)) {
                arr[i][j] = a - i;
            }
            i++;
            j--;
        }
//======================================================
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//I don't comment ,bcoz its challenging to code
//Try urself hard to understand (its not that hard😉)

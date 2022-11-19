package Interview.zoho;

import java.util.ArrayList;

public class Completing_tasks {
//https://practice.geeksforgeeks.org/problems/completing-tasks0454/1
public static void main(String[] args) {
        int n = 15; // number of task
        int m = 6;//n.o of task that carried out by the 3 nameless guys
        int[] arr = {2, 5, 6, 7, 9, 4};
        findNoOfWorks(n,m,arr);
    }

    private static void findNoOfWorks(int n, int m, int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        int[] ans = new int[n-m];
        int count=0;
        for (int i : arr) a.add(i);
        for(int i=1;i<=n;i++) if(!a.contains(i)) ans[count++] =i;
        for(int i=0;i<n-m;i++) {
            if(i % 2 == 0){
                System.out.print("\nTanya  ");
                System.out.print(ans[i] + "  ");
            }
            else
            {
                System.out.print("Manya ");
                System.out.print(ans[i]);
            }
        }

    }
}

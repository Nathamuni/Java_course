package Interview.WileyEdge;

import java.util.Scanner;

/*The number of goals achieved by two football teams in matches in a league is given in the form of two lists.
For each match of team B. Compute the total number of matches of team A where team A has scored less than or equal to
the number of goals scored by team B in that match.*/
public class Ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a1= new int[n];
        for(int i=0; i<n ; i++){
            a1[i] = s.nextInt();
        }
        int m = s.nextInt();
        int a2[] = new int [m];
        for(int i=0; i<m ;i++){
            a2[i] = s.nextInt();
        }
        for(int i=0; i<m; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(a2[i]>=a1[j])
                    count++;
            }
            System.out.println(count);
        }
    }
}

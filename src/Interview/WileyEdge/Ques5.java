package Interview.WileyEdge;

import java.util.Scanner;

/*Raman was playing a game,  he starts with x coins. Now in every step, he wins and loses and he has to get the money
 or pay the money as needed. He came in contact with a psychic who can see the future and the
  Psychic predicted the outcomes after each step. Now Raman wants to start the game with the minimum wage
   where he doesn’t run out of money.  Help Raman to find what money he should start with. The only rule
   to keep playing is not going in a credit situation.

 */
public class Ques5 {
//    4
    //    2
//    -9
//    -8
//     2
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        int amt=0;
        for(int i=0; i<n; i++){
            sum+=s.nextInt();
            if(sum<0) amt= Math.max(amt,sum*-1);
        }
        System.out.println(amt);
    }
}

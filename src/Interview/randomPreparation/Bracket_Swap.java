package Interview.randomPreparation;

//Minimum Number of Swaps to Make the String Balanced
//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
public class Bracket_Swap {
    public static void main(String[] args) {
        String s = "][[]][][[][]";
        System.out.println(FindSwapCount(s));
    }

    private static int FindSwapCount(String s) {
        int i =0;
        char [] ch = s.toCharArray();
        int j = s.length()-1;
        int count=0,flag =0;
        int lb =0; int rb =0;
        while(i<(j-1)){
            while(ch[i] == '[') {
                flag =0;
                if(rb>0) rb--;
                else
                    lb++;
                i++;

            }
            while(ch[j] == ']'){
                if(lb>0){
                    lb--;
                    flag =1;
                }
                else{ // No comments simply waste...
                    flag =0;
                    rb++;
                }
                j--;
            }
            if (flag == 0) {
                count++;

            }

            i++ ;j--;

        }
        return count;
    }
}

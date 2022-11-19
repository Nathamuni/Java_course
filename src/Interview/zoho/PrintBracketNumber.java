package Interview.zoho;

import java.util.ArrayList;

public class PrintBracketNumber {
    public static void main(String[] args) {
        String S = "(((ezj)f())())t(";
        System.out.println(bracketNumbers(S));
    }
    public static ArrayList<Integer> bracketNumbers(String S) {
        char[] c =S.toCharArray();
        int count=0;
        
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> stack = new ArrayList<>();
        for(char ch : c){
            if(ch == '('){
                array.add(++count);
                stack.add(count);
            }
            else if(ch == ')'){
                array.add(stack.get(stack.size()-1));
                stack.remove(stack.get(stack.size()-1));
            }
        }
        return array;
    }
}

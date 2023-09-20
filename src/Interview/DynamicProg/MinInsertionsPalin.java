package Interview.DynamicProg;

public class MinInsertionsPalin {
    public static void main(String[] args) {
        String s = "MABCBA";
        //          MAABCBAAM
                    //ABCAA
        System.out.println(MinInsertionsToMakeStrPalindrome(s));
    }
    public static int MinInsertionsToMakeStrPalindrome(String s){
//        for(int i=0; i<s.length() ; i++){
//            if(s.charAt(i))
//        }
        int l=0,h=s.length()-1,count=0,count2=0;
        while (l < h) {
            if(s.charAt(l) != s.charAt(h)){
                count++;
                h--;
            }else{
                l++; h--;
            }

        }
        l=0;h=s.length()-1;
        while (l < h) {
            if(s.charAt(l) != s.charAt(h)){
                count2++;
                l++;
            }else{
                l++; h--;
            }
        }
        return Math.min(count,count2);
    }
}

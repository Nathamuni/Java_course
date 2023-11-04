package Interview;

public class palindromeRecursion {

        public static void main(String[] args) {

            String s ="paap";
            int i,j=i=(s.length()/2)+1;
            if(s.length()%2==0){
                i=s.length()/2;
            }
           //   System.out.println(palin1(s,0,s.length()-1));
            System.out.println(palin2("",s,s.length()-1));
            //  System.out.println(palin(s,i,j,0));
            System.out.println(i +" -----" + j);

        }
        static boolean palin(String s,int i,int j,int count){
//         if(i>=0 && j<s.length() && s.charAt(i) != s.charAt(j)){
//             ;
//         }
            if(count == s.length()) return true;

            if(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
                count+=2;
                palin(s,i-1,j+1,count);
            }
            return false;
        }
        // best practice is to start with end and move to mid
        static boolean palin1(String s,int i,int j){

            if(i>j) return true;

//    if(s.charAt(i)==s.charAt(j) && i<=j) {
            palin1(s,i+1,j-1);
            return s.charAt(i)==s.charAt(j) ;
//    }

        }
    static boolean palin2(String s1, String given,int i)
    {
        if(i==given.length()-1 ) return s1.equals(given);
            palin2(given.charAt(i)+s1,given,i-1);
        return s1.equals(given);
    }


}

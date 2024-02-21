package Interview.tenkasiZoho.Round1;

public class sum1 {
    static boolean zoho(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j))
            {
                i++;j--;
            }
            else{
                return help(s,i+1,j) ||help(s,i,j-1) ;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(zoho( s));
    }
    static boolean help(String s ,int i , int j){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j))
            {
                i++;j--;
            }
            else
                return false;

        }
        return true;

    }
}
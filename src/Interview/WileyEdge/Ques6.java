package Interview.WileyEdge;

public class Ques6 {
    /*
    Output the minimal and the maximal difference between two given strings
separated with a Single space.
*/
    public static void main(String[] args) {
        String s1 = "???a";
        String s2 = "???a";
//        mindif
        int c1=s1.length(),c2=s2.length();

        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)=='?' || s2.charAt(i)=='?')
                c1--;
            else if(s1.charAt(i)!='?' && s2.charAt(i)!='?'
                    && s1.charAt(i)==s2.charAt(i)) {
                c1--;
                c2--;
            }
//            else if()
        }
        System.out.println(c1+" "+c2);
    }
}

package Interview.tenkasiZoho.Round1;

public class sum9 {
    public static void main(String[] args) {
        String s1="aA",s2="aAAbbbb";
        int num=0;
        for(int i=0; i< s2.length() ; i++){
            if(s1.indexOf(s2.charAt(i)) != -1)
                num++;
        }
        System.out.println(num);
    }
}

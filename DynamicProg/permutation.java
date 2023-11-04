package Interview.DynamicProg;

public class permutation {
    public static void main(String[] args) {
        permu("namu",0,"");
    }

    static void permu(String s1,int i,String s){
        if(i>=s1.length()) {
            System.out.println(s);
            return;
        }

        permu(s1,i+1,s);
        s += s1.charAt(i) ;
        permu(s1,i+1,s);

    }
}

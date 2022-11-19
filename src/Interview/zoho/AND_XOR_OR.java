package Interview.zoho;

public class AND_XOR_OR {
    //Given a string to perform respect to
    //A-and B-or C-xor

    public static void main(String[] args) {
        converter("1A0B1C1");
    }

    private static void converter(String s) {
        int sum=0;
        int flag =1;
        char[] ch =  s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A') {
                if(flag == 1){
                    sum = (ch[i-1] - 48) & (ch[i+1] - 48) ;
                    flag =0;
                }else  sum = sum & (ch[i+1]-48);
            }
            if(ch[i] == 'B') {
                if(flag == 1){
                    sum = (ch[i-1] - 48) | (ch[i+1] - 48) ;
                    flag =0;
                }else  sum = sum | (ch[i+1]- 48) ;
            }
            if(ch[i]=='C') {
                if(flag == 1){
                    sum = (ch[i-1] - 48) ^ (ch[i+1] - 48) ;
                    flag =0;
                }else  sum = sum ^ (ch[i+1] -48);
            }
        }
        System.out.println(sum);
    }
}

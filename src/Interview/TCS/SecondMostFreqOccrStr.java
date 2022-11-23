package Interview.TCS;

public class SecondMostFreqOccrStr {
    public static void main(String[] args) {
        String []s = {"aaa","bbb","ccc","bbb"};
        System.out.println(secFreqEle(s));
    }

    private static String secFreqEle(String[] s) {
        int max=0,SecondMax=0;
        String out="";

        for(int i=0; i< s.length;i++) {
            int count=0;
            for(int j=i; j< s.length;j++) {
                if(s[i].equals(s[j]))
                    count++;
            }
            if((count < max && count > SecondMax)){
                SecondMax = max;
                out = s[i];
            }
            max = Math.max(count ,max);


        }
        return  out;
    }
}

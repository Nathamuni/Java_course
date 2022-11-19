package Interview.zoho;

public class RepeatEachChar {
    String s = "H1e1l1l1o99";
    char []ch = s.toCharArray();
    public static void main(String[] args) {
        RepeatEachChar rec = new RepeatEachChar();
        rec.summa();
    }
    public void summa(){
        int dig=0;
        char c1=' ';
        for(int c : ch)
        {
            if(c >47 && c<58)
            {
                c-=48;
               dig = (dig * 10) +c;
            }
            else{
                dig=0;
                 c1 = (char)c;
            }
            if(dig != 0)
            {
                for(int i =0;i<dig;i++)
                {
                    System.out.print(c1);
                }
            }
        }
    }

}

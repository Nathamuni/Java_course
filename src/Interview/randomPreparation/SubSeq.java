package Interview.randomPreparation;
// pick | not pick
public class SubSeq {
    public static void main(String[] args) {
        sub("","abc ");
    }
    public static void sub(String processed,String Unprocessed){
        if(Unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char c = Unprocessed.charAt(0);
        sub(processed+c,Unprocessed.substring(1));
        sub(processed,Unprocessed.substring(1));
    }
}

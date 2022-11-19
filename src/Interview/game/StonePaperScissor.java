package Interview.game;
import java.util.*;
public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        al.add("stone");
        al.add("paper");
        al.add("scissor");
        String str = " ";
        while(str.length()!=0) {
            System.out.println("\nEnter : ");

            str = s.next();
            int a = Math.abs((int)(Math.random() * 10000))%3;
            System.out.println(al.get(a));

            if(str.equals("paper") && al.get(a).equals("stone") ||
                    str.equals("stone") &&  al.get(a).equals("scissor")||
                    str.equals("scissor") &&  al.get(a).equals("paper")) System.out.print("You win");
            else if(str.equals( al.get(a))){ System.out.print("Draw");}
            else System.out.println("Thothutaa");
        }
    }
}

package Sem3;
import java.io.BufferedReader;
import java.io.FileReader;

public class VowelCounter {
    public static void main(String[] args) throws Exception{

           // File file = new File("D:/My projects/Java/out/production/Java/Sem3/txtfile.txt");
            BufferedReader br = new BufferedReader(new FileReader("D:/My projects/Java/out/production/Java/Sem3/txtfile.txt"));
            int i = br.read();

            int count=0;
            while (i != -1) {
                int c =  i;
                String newstr = Character.toString(c).replaceAll("[AEIOUaeiou]","");
                if("" == newstr ){
                    count++;
                }
                i = br.read();
            } System.out.print("N.o of vowels present are "+count);

        }
    }


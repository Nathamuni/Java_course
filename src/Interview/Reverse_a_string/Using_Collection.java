package Interview.Reverse_a_string;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Using_Collection {
    public static void main(String[] args) {
        String given = "Nathamuni";
        char[] arr = given.toCharArray();

        ArrayList list = new ArrayList<Character>();

        for(char character : arr)
        {
            list.add(character);
        }
        Collections.reverse(list);
        // collections is an inbuilt class

        ListIterator lt = list.listIterator();
        while(lt.hasNext()){

            System.out.println(lt.next());

        }
    }
}

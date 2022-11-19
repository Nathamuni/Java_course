package New_Java_updates;

import java.util.Arrays;
import java.util.List;

public class Method_reference {

    public static void main(String[] args) {
        List values = Arrays.asList(1,2,3,4,5,6);
//    instead of using list.forEach(x -> System.out.println(x));
//    since we explicitly specify for each value print the

        values.forEach(System.out::println);
//      here :: is method reference operator

    }
}

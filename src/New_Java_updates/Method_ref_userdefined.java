package New_Java_updates;

import java.util.Arrays;
import java.util.List;
public class Method_ref_userdefined {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        values.forEach(i->DoubleTheValue(i)); // Internal iteration by picking each values and executing it
System.out.println();
        values.forEach(Method_ref_userdefined :: DoubleTheValue);
    }// Method-reference with User defined function

    public static void DoubleTheValue(int x){
        System.out.println(x*2);
    }

}

//Ex of array iteration with anonymous class and lambda expression
package New_Java_updates;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayItration {
  public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
/*//        traditional for loop
        for (int i=0;i<6;i++){
            System.out.println(list.get(i));
        }
        System.out.println();

//        Using iterator
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

//        Using for-each loop
        for (int i: list) {
            System.out.println(i);
        }*/
//        The above mentioned are called External iterations
//--------------------------------------------------------------------
//      there is another concept of Internal iteration

      list.forEach(x -> System.out.println(x)); // for every value of x actOn(->)...
//     this forEach accepts Consumer_interface_obj
      System.out.println("");
//=============Now lets c how it works===================
//      FunctionalInterface is interface which contain only one ABS method {Consumer}

      Consumer c = new Consumer<Integer>() {
//Here we create an anonymous class with reference to Consumer interface
          @Override
          public void accept(Integer i) { // inbuilt class
              System.out.println(i);
          }
      };
      list.forEach(c);// Utility-method ..implements Consumer interface

      System.out.println();
//=================To simplify this=====================
       Consumer<Integer> m = (j)-> System.out.println(j); // lambda expression
//       Mainly a method needs method name,parameter,return types
//      As it is specified inside the interface it is unnecessary .
      list.forEach(m);

//      On much simpler form [ list.forEach(j -> System.out.println(j)); ]
    }
}

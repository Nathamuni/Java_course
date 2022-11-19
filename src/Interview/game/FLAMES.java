package Interview.game;
import java.util.*;
public class FLAMES {
    String s1 = "nathamuni";
    String s2 = "madavan";
    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();
    HashMap<Character, Integer> h1 = new HashMap<>();
    HashMap<Character, Integer> h2 = new HashMap<>();

    public static void main(String[] args) {
        FLAMES f = new FLAMES();
        f.count();
        f.find(f.check());
    }

    public void count() {
        int i;
        int a = 1, b = 1;
        for (i = 0; i < arr1.length; i++) {
            a = 1;
            if (h1.containsKey(arr1[i])) {
                a = h1.get(arr1[i]);
                h1.put(arr1[i], ++a);
            } else h1.put(arr1[i], a);
        }
        for (i = 0; i < arr2.length; i++) {
            b = 1;
            if (h2.containsKey(arr2[i])) {
                b = h2.get(arr2[i]);
                h2.put(arr2[i], b + 1);
            } else h2.put(arr2[i], b);
        }

        System.out.println(h1);
        System.out.println(h2);

    }

    public int check() {
        int count = 0;
        for (char c : h1.keySet()) {
            if (h1.containsKey(c) && (h2.containsKey(c))) {
                count += Math.abs(h1.get(c) - h2.get(c));
                h1.replace(c, 0);
                h2.replace(c, 0);
            }
        }
        for (char c : h1.keySet()) count += h1.get(c);
        for (char c : h2.keySet()) count += h2.get(c);
        return count;
    }

    public void find(int count) {
        int i=0;
        char[] arr1 = {'F','L','A','M','E','S'};
   ArrayList<Integer> arr = new ArrayList<>();
      arr.add(0);
      arr.add(1);
      arr.add(2);
      arr.add(3);
      arr.add(4);
      arr.add(5);

      int a,b;
      while (arr.size() >1){

          for(b=0; b<arr.size() ;b++){

          }

      }


        System.out.println(arr);
    }
}

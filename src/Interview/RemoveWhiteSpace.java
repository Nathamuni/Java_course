// State different ways to remove whitespace
package Interview;

public class RemoveWhiteSpace {
    /*
    * using trim() function
    * Using strip(), StripLeading, StripTrailing(from JAVA-11)
    *  1. ^[ \t]+|[ \t]+$ -> leading and trailing
    *  2. ^[ \t]+ -> leading
    *  3. [ \t]+$ -> trailing*/
    public static void main(String[] args) {
        String s = "  Hello everyone  ";
        System.out.println(s);
        //Type 1
        System.out.println("Type 1 : \n"+s.trim());
        //Type 2
        System.out.println("Type 2 : \n"+s.strip()); // strip is from java-11
        //Type 3
        System.out.println("Type 3 : ");
        System.out.println(s.replaceAll("^[ \t]+|[ \t]+$",""));
        System.out.println(s.replaceAll("^[ \t]+",""));
        System.out.println(s.replaceAll("[ \t]+$",""));
    }

}

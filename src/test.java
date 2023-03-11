// Java program to Demonstrate asList() method
// of Arrays class For an int value

// Importing utility classes
import java.util.*;

// Main class
 class GFG {

    // Main driver method
    public static void main(String[] argv) throws Exception
    {
        // Try block to check for exceptions
        try {

            // Creating Arrays of int type
            int a[] = new int[] { 10, 20, 30, 40 };
          // Getting the list view of Array
            List list = Arrays.asList(a);
//            System.out.println(list(1));


            // Printing all the elements inside list object
            System.out.println("The list is: " + list);
        }

        // Catch block to handle exceptions
        catch (NullPointerException e) {

            // Print statements
            System.out.println("Exception thrown : " + e);
        }
    }
}

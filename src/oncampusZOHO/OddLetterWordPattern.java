package oncampusZOHO;

public class OddLetterWordPattern {
    public static void main(String[] args) {

        String s = "program";
        if(s.length() %2 ==1)
            printPattern(s.toCharArray());
    }

    private static void printPattern(char[] arr) {
int size = arr.length;
        for(int i=0;i<size ;i++){
            for(int j=0; j<size ; j++){
                if(i==j)
                    System.out.print(arr[i]);
                System.out.print("  ");
                if(size-i-1==j)
                    System.out.print(arr[size-i-1]);
            }
            System.out.println();
        }

    }
}

package Interview.zoho;
/*1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains four space-separated integers A, B, C, and N.*/

public class OnacciNumber {
    //(summation of N-1th, N-2th, and N-3th geek-onacci numbers)
    public static void main(String[] args) {
        Integer a = Integer.valueOf(args[0]);
        Integer b = Integer.valueOf(args[1]);
        Integer c = Integer.valueOf(args[2]);
        Integer n = Integer.valueOf(args[3]);

        int value=0;
        for(int i =3; i<n; i++){
             value = a+b+c;
            a=b;
            b=c;
            c=value;
        }
        System.out.println(value);
    }
}

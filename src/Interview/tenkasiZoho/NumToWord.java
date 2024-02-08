package Interview.tenkasiZoho;

import java.util.*;

public class NumToWord {
    static HashMap<Integer, String> numDict;
    static String s[];
    static {
        numDict = new HashMap<>();
        numDict.put(1,"one");numDict.put(11,"eleven");  numDict.put(30,"thirty");
        numDict.put(2,"two");numDict.put(12,"twelve");  numDict.put(40,"forty");
        numDict.put(3,"three");numDict.put(13,"thirteen");  numDict.put(50,"fifty");
        numDict.put(4,"four");numDict.put(14,"fourteen");   numDict.put(60,"sixty");
        numDict.put(5,"five");numDict.put(15,"fifteen");    numDict.put(70,"seventy");
        numDict.put(6,"six");numDict.put(16,"sixteen"); numDict.put(80,"eighty");
        numDict.put(7,"seven");numDict.put(17,"seventeen"); numDict.put(90,"ninety");
        numDict.put(8,"eight");numDict.put(18,"eighteen");numDict.put(100,"hundred");
        numDict.put(9,"nine");numDict.put(19,"nineteen");
        numDict.put(10,"ten");numDict.put(20,"twenty");

//        HashMap<Integer, String> value = new HashMap<>();
        s = new String[]{"thousand", "hundred", "and"};
    }

    public void converter(int n){
        //9 3 4 5 3
        int temp=0,flag=0;
        if(n / 10000 >0 ){

            if(n / 10000 ==1)
                callme(n/1000);
            else {
                temp = (n / 10000);
                callme(temp * 10);
              //  n -= temp * 10;
            }
            flag = 1;
            // 3 4 5 3
        }
//        else if(n % 10000 == 1)
        if(n / 1000 >0 && n / 10000 != 1){
            n -= temp * 10000;
            callme(n/1000);
            flag =1;
        }
        if(flag==1) System.out.print(s[0]+" ");

        temp = n/1000;
        n -= temp * 1000;


        //4 5 3
        if(n / 100 >0){
            callme(n/100);
            System.out.print(s[1]+" ");
            if(n%100 >0 )
                System.out.print(s[2]+" ");
        }
        temp = n/100;
        n -= temp * 100;

        //5 3
        if(n/10 >1){
            callme((n/10)*10);
            if(n%10 !=0)
                callme(n % ((n/10)*10));
        }else if(n!= 0){
            callme(n);
        }
    }
    public static void callme(int x){

        System.out.print(numDict.get(x)+" ");

    }

    public static void main(String[] args) {
        NumToWord nm = new NumToWord();
        int n= 79043;
        System.out.println(n);
        nm.converter(n);
    }


}

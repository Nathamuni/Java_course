package Interview.tenkasiZoho.Round2;

import java.util.HashMap;

public class Num_to_word {
    static HashMap<String, String> numDict;
    static String s1[];
    static {
        numDict = new HashMap<>();
        numDict.put("1","one");numDict.put("0","");numDict.put("00","");numDict.put("11","eleven");  numDict.put("30","thirty");
        numDict.put("2","two");numDict.put("12","twelve");  numDict.put("40","forty");
        numDict.put("3","three");numDict.put("13","thirteen");  numDict.put("50","fifty");
        numDict.put("4","four");numDict.put("14","fourteen");   numDict.put("60","sixty");
        numDict.put("5","five");numDict.put("15","fifteen");    numDict.put("70","seventy");
        numDict.put("6","six");numDict.put("16","sixteen"); numDict.put("80","eighty");
        numDict.put("7","seven");numDict.put("17","seventeen"); numDict.put("90","ninety");
        numDict.put("8","eight");numDict.put("18","eighteen");numDict.put("100","hundred");
        numDict.put("9","nine");numDict.put("19","nineteen");
        numDict.put("10","ten");numDict.put("20","twenty");

//        HashMap<Integer, String> value = new HashMap<>();
        s1 = new String[]{"thousand", "hundred", "and"};
    }
    public static void main(String[] args) {
        int n=70010;
        String s = Integer.toString(n);
        callMe(s.toCharArray());

    }

    private static void callMe(char[] c) {
        String s="";
        int n = c.length;

            if(n==5){
                if(c[0]==1){
                    s+=c[0]+c[1];
                    System.out.print(numDict.get(s));
                }else {
                    s+=c[0]+"0";
                    System.out.print(numDict.get(s)+" ");
                    System.out.print(numDict.get(""+c[1]));

                }
            }
        else if(n==4){
                s=""+c[0];
                System.out.print(numDict.get(s));
            }

        if(n>3) System.out.print(" "+s1[0]);

        if(n>=3 && c[n-3] != '0'){
            s=""+c[n-3];
            System.out.print(" " +numDict.get(s)+" "+s1[1]+" and ");
        }
    if(n>=2){
        s="";
            if(c[n-2]==1){
                s+=c[n-2]+c[n-1];
                System.out.print(numDict.get(s)+" ");
            }else {
                s+=c[n-2]+"0";
                System.out.print(numDict.get(s)+" ");

            }
        System.out.print(numDict.get(""+c[n-1]));
    }
    }
}

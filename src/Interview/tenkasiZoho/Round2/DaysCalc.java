package Interview.tenkasiZoho.Round2;

import java.util.HashMap;

public class DaysCalc {
    static  HashMap<String,Integer> hs = new HashMap<>();
    static String s = "12-Dec-2023", s1 = "28-Feb-2025";//12 - 12 - 2023
    static int d,m,y;
    static int d1,m1,y1;

    public static void main(String[] args) {
        int days=0;
        init();

        while(y1>y || (y1==y && m<m1)){

            if(m%2 == 1 || m==8){
                days+=31;
            }else{
                if(m==2 && y%4 != 0) days+=28;
                else if(m==2 && y%4 == 0) days+=29;
                else days+=30;
            }

            if(m%12 ==0) {
                y++;
                m=0;
            }
            m++;
        }

        days -= d;
        days += d1;
        System.out.println(days);



    }
    static void init(){
        String temp ="";
        hs.put("Jan",1);
        hs.put("Feb",2);
        hs.put("Mar",3);
        hs.put("Apl",4);
        hs.put("May",5);
        hs.put("Jun",6);
        hs.put("Jul",7);
        hs.put("Aug",8);
        hs.put("Sep",9);
        hs.put("Oct",10);
        hs.put("Nov",11);
        hs.put("Dec",12);

//=====================================================
        d=(s.charAt(0)-48)*10+ (s.charAt(1)-48);

//=====================================================
        temp +=
                s.charAt(3)+""+
                s.charAt(4)+""+
                s.charAt(5);
        m= hs.get(temp);
        temp="";
//=====================================================
        y = 1000*(s.charAt(7)-48)+
                100*(s.charAt(8)-48)+
                10*(s.charAt(9)-48)+
                s.charAt(10)-48;

//=====================================================
        d1 = (s1.charAt(0)-48)*10+ (s1.charAt(1)-48);

//=====================================================
        temp="";
        temp +=s1.charAt(3)+""+
                s1.charAt(4)+""+
                s1.charAt(5);
        m1= hs.get(temp);
//=====================================================
        y1=1000*(s1.charAt(7)-48)+
                100*(s1.charAt(8)-48)+
                10*(s1.charAt(9)-48)+
                s1.charAt(10)-48;
    }
}

import java.util.ArrayList;
import java.util.List;

class c{
    public static void main(String[] args) {
int n=12,flag =1;
        for(int i=0; i< 8 ; i++){

            int m=i;
            while(m<(n)){
                System.out.print(" "); m++;
            }
            for(int j =0 ; j<=i ; j++){

                System.out.print("* ");
            }
            if(i==3 && flag ==1){
//                System.out.println();
                i-=2; flag =0;
            }
            if( i==6 && flag ==0){
                i-=2; flag =1;
            }
            System.out.println();
        }
for(int i =0; i<4 ;i++){
    for(int j=0 ; j<4 ; j++) {
        System.out.print("  ");
//        System.out.print("*");
    }for(int j=0 ; j<4 ; j++) {

        System.out.print(" *");
    }
    System.out.println();
}



//        c c = new c();
//        String s = "abc";
//        System.out.print("{");
//        c.va(s,s.length()-1,"");
//        System.out.print("}");
//    }
//    void va(String s,int i,String str){
//
//        if(i<0) {
//            if(!str.equals(""))
//                System.out.println("{"+ str +"}");
//            return;
//        }
//
//        va(s,i-1,str);
//        va(s,i-1,str+s.charAt(i));
////        str+=s.charAt(i) ;
////        return str;
    }

}
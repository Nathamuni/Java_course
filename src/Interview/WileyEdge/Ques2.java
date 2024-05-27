//package Interview.WileyEdge;
//
//import java.util.Scanner;
///*There are 13 buttons on his remote: 10 buttons for the numbers (0-9) to form integers denoting respective channel index,
// “Up channel” button and “ Down channel” button for going i +1th channel and i-1th channel from i respectively,
//  and a “Last viewed” button to see what’s the last channel before it.*/
//public class Ques2 {
//    static Scanner s = new Scanner(System.in);
//    public static void main(String[] args) {
//        int  cur = s.nextInt();
//        int back = -1;
//        int to = s.nextInt();
//
//        System.out.println("enter true to continue  ");
//        boolean Do = s.nextBoolean();
//        while(Do==true){
//            cur = to;
//            System.out.println("Enter to channel");
//            to = s.nextInt();
//            System.out.println(minchannel(cur,to,back));
//            back=cur;
//        }
//
//    }
//    public static int minUpDOWN(int count ,int cur, int to){
//        int temp=0;
//        int count1 = count;
//        while(count>0 && to<= cur){
//            if(cur == to )return temp;
//            else{
//                cur--;
//                temp++;
//                count--;
//            }
//        }
//        while(count>0 && to>= cur){
//            if(cur == to )return temp;
//            else{
//                cur++;
//                temp++;
//                count--;
//            }
//        }
//        return count1;
//    }
//    public static int minchannel(int cur,int to,int back){
//        int count = Integer.toString(to).length();
////        if(back==to)
////            int backAndUpDown = Math.min(count,minUpDOWN(count,cur,to));
////        if((minUpDOWN(count,back,to)+1)< count) return
//
//        Math.min((minUpDOWN(count,back,to)+1),
//                Math.min(count,minUpDOWN(count,cur,to)));
//    }
//}

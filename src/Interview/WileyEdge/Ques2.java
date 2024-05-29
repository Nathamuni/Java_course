package Interview.WileyEdge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*There are 13 buttons on his remote: 10 buttons for the numbers (0-9) to form integers denoting respective channel index,
 “Up channel” button and “ Down channel” button for going i +1th channel and i-1th channel from i respectively,
  and a “Last viewed” button to see what’s the last channel before it.*/
public class Ques2 {
    static Scanner s = new Scanner(System.in);
    static List<Integer> blocked= new ArrayList<>();

    public static void main(String[] args) {
        int lowest= s.nextInt();
        int highest= s.nextInt();

        int noOfBlocked = s.nextInt();
        for(int i =0; i<noOfBlocked ; i++) blocked.add(s.nextInt());

        int NoChannel = s.nextInt();
        ArrayList<Integer> Channel = new ArrayList<>();
        for(int i =0; i<NoChannel ; i++) Channel.add(s.nextInt());

//=====
        System.out.println(minchannel(lowest,Channel.get(0),-1,lowest,highest));
        for(int i=0; i<NoChannel-1;i++) {
            int x=0;
            if(i-1<0)x=lowest;
            else x=Channel.get(i-1);

            System.out.println(minchannel(Channel.get(i),Channel.get(i+1),x,lowest,highest));
        }
    }

    // up ,down, blocked, circular
    public static int minUpDOWN(int count ,int cur, int to,int min,int max){
        int temp=0;
        int count1 = count;
        while(count>0 && to<= cur){
            if(blocked.contains(cur)) cur--;// to skip blocked channels while going down
            if(cur<min) cur=max;   // for cycling the numbers
            if(cur == to )return temp; // return minimum as loop allows only count>0
            else{
                cur--;
                temp++;
                count--;
            }
        }
        while(count>0 && to>= cur){
            if(blocked.contains(cur)) cur++;
            if(cur>max) cur=min;
            if(cur == to )return temp;
            else{
                cur++;
                temp++;
                count--;
            }
        }
        return count1;
    }
    public static int minchannel(int cur,int to,int back,int min,int max){
        //length by entering number
        int count = Integer.toString(to).length();
        if(back==to) return 1;


        //which is minium
        return Math.min((minUpDOWN(count,back,to,min,max)+1),
                Math.min(count,minUpDOWN(count,cur,to,min,max)));
    }
}

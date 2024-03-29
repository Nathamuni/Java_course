package oncampusZOHO;

public class twodArrayFormation {
    public static void main(String[] args) {
        String t="ETO";
        String s = "WELCOMETOZOHOCORPORATION";
        Character [][] arr = new Character[s.length()/5 +1][5];
//        System.out.println(s.length()/5 +1);

        char c[] =s.toCharArray();
        int i=-1,j=0;
        for(char c1 : c){
            if(j%5 == 0){
                i++;
            }

            arr[i][j%5] = c1;
            j++;
        }
        System.out.println(find(s,t,arr));
    }

    public static boolean find(String s, String t,Character [][]arr){
        char c[] =s.toCharArray();
        int i=-1,j=0;

        int x=0;
        int flag =1;
        for( i=0 ;i <5;i++){
            for(j=0 ;j < 5; j++) {
                if(arr[i][j] == t.charAt(x)){
x=1;
                    while(j+x<5 && arr[i][j+x] ==t.charAt(x)){
                        x++;
                        if(x==t.length()) {
                            return true;
                        }
                    }x=0;
                    while(i+x<5 && arr[i+x][j] ==t.charAt(x)){
                        x++;
                        if(x==t.length()) {
                            return true;}
                    }
//                    return false;
                }
            }
        }
        return false;
    }
}

package Interview.zoho;

public class MaxPiecesCakeCut {
    //I have given number of cut in a cake to find maximum pieces cut
    //to return max number of cuts

    public static void main(String[] args) {
        int pieces = 1;
        System.out.println(cutTheCake(pieces));
    }

    private static int cutTheCake(int n) {
        int out=0;
        //cut if we have an even number of cut
// 2(n/2) cut(top down wx.2 we have 4 pieces)  *   (n/2) + 1 coz cutting n times gives n+1 pieces
        if(n%2==0 && n>0){
            out = 2*(n/2) * ((n/2)+1);
        }
//        if odd cuts more cut horizontally leaves max pieces
        else if(n%2==1 ){
            //n/2 floor(eg 5) horizontal 3 vertical 2 to maximize output
            out = 2*((n/2)+1) * ((n/2)+1);
        }
        else System.out.println("Invalied Input");
        return out;
    }
}

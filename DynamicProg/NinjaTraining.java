package Interview.DynamicProg;

public class NinjaTraining {
    public static void main(String[] args) {
        int a[][]={{10,4,5},{12,3,4},{4,5,3}};
        System.out.println(max(a,a.length-1,2));
    }

    private static int max(int[][] a,int index,int col) {
        int out[] = new int[3];
        int pick=0,dont=0;
        if(index<0) {
            if(col==0) return out[0]+out[1]+out[2];
            index =a.length-1;
            out[col]=Math.max(pick,dont);
            col--;
        }
         pick = a[index][col]+ max(a,index-2,col);
         dont = 0 +  max(a,index-1,col);
        out[col]=Math.max(pick,dont);
        return out[0]+out[1]+out[2];
    }
}

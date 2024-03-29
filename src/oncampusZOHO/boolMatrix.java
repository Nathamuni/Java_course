package oncampusZOHO;

import java.util.ArrayList;
import java.util.HashSet;

public class boolMatrix {
    public static void main(String[] args) {
        int a[][]={{1,0,0,0},{0,0,0,0},{0,0,1,0}};
        booMat(a);
    }

    private static void booMat(int[][] a) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for(int i =0 ; i< a.length ; i++){
            for(int j=0; j<a[0].length;j++){
                if(a[i][j]==1){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int b[][] = new int[a.length][a[0].length];
        /*for(int i =0 ; i< a.length ; i++){
            for(int j=0; j<a[0].length;j++){
                if(row.contains(i)){
                    int k1=i,k2=j;

                    while(k1<a[0].length)
                }
            }
        }*/
        for(int i : row){
            for(int x=0 ;x<a[0].length;x++){
                b[i][x]=1;
            }
        }
        for(int j : col){
            for(int x=0 ;x<a.length;x++){
                b[x][j]=1;
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}

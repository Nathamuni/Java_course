package oncampusZOHO;
/*
666666
655556
654456
654456
655556
666666*/

public class MATRIX {
    public static void main(String[] args) {
        int n=6;
        int [][] a = new int[n][n];
        for(int i=0; i<n/2 ; i++){

            for(int j=0; j<n/2 ; j++){
                if(i==0 || j==0 || i==n-1 ||j==n-1){
                    a[i][j]=n;
                }
                else if((a[i-1][j] + a[i][j-1])%2==0){
                    a[i][j]= (a[i-1][j] + a[i][j-1])/2 -1;
                }
                else
                    a[i][j]= (a[i-1][j] + a[i][j-1])/2;
            }
        }for(int i=n-1; i>n/2 ; i--){

            for(int j=n-1; j>n/2 ; j--){
                if(i==0 || j==0 || i==n-1 ||j==n-1){
                    a[i][j]=n;
                }
                else if((a[i-1][j] + a[i][j-1])%2==0){
                    a[i][j]= (a[i-1][j] + a[i][j-1])/2 -1;
                }
                else
                    a[i][j]= (a[i-1][j] + a[i][j-1])/2;
            }
        }
        for(int i=0; i<n ; i++){
            for(int j=0; j<n ; j++){
                System.out.print(a[i][j]+ " ");

            }
            System.out.println();}
    }
}

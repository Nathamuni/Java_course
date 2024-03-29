package oncampusZOHO;

public class snakeMatric {

    public static void main(String[] args) {
        int [][] a = new int[3][3];
        int k=0;
        int n=3;
        for(int i=0;i<n ; i++){
            for(int j=0;j<n ; j++){
//                System.out.println();
                a[i][j]=k++;
            }
        }

        for(int i=0;i<n ; i++){
            for(int j=0;j<n ; j++){
//                System.out.println();
                if(i%2==0)
                System.out.print(a[i][j]);
                else
                    System.out.print(a[i][n-1-j]);
            }
            System.out.println();
        }

    }}

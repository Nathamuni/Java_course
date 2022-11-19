package Interview.zoho;

import java.util.*;
public class snakeMatrixPrinting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lim = s.nextInt();
        int [][]array = new int[lim][lim];
        for(int i=0; i<lim;i++)
            for(int j=0; j<lim;j++)
            {
                System.out.println("Enter "+i+","+j+" th element");
                array[i][j] = s.nextInt();
            }
        int i=0,j=0;
            while( i<lim &&  j<=lim){
                if(j < lim && i%2==0)
                {
                    System.out.print(array[i][j]+" ");
                    j++;
                }
                else if(j==lim)
                {
                    i+=1;
                    j--;
                }
                else
                {
                    if(j>=0){
                        System.out.print(array[i][j]+" ");
                        j--;
                        if(j==-1){i++;j++;}
                    }

                }
            }
        }
}

package Interview.tenkasiZoho.Round2;

public class practice_Island {

    public static void main(String[] args) {
        int a[][] ={
                {1,0,1,0},
                {1,1,0,0},
                {0,0,0,1},
                {0,1,0,0}
        };
        int count =0;
        for(int i=0 ; i< a.length; i++){
            for( int j=0 ; j< a[0].length ;j++){
                if(a[i][j]==1){
                    count++;
                    illMakeIt0(i,j,a);
                }
            }
        }
        System.out.println(count);
    }
    static void illMakeIt0(int i,int j,int [][] a){
        if(i== a.length || j== a[0].length || i<0 || j<0 || a[i][j]!=1) return;
        if(a[i][j]==1) a[i][j]=0;
        //dig
        illMakeIt0(i-1,j-1,a);
        illMakeIt0(i-1,j+1,a);
        illMakeIt0(i+1,j+1,a);
        illMakeIt0(i+1,j-1,a);
        // straight
        illMakeIt0(i,j+1,a);
        illMakeIt0(i,j-1,a);
        illMakeIt0(i+1,j,a);
        illMakeIt0(i-1,j,a);
    }
}

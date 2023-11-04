package Interview.TCS;

public class MyNQTqs2 {
    //to convert the number of zeros to 1 where we have to return the max contiguous sum
    public static void main(String[] args) {
        int a[]={1,1,0,0,0,1,1,1};
//        1 1 0 0 0 0 1
//        1 1 1 1 0 0 0 1 1
        int n = 3;
        int count =0,max=0,j=0;
        int start=0,flag=0,stat=0;
// to check left n positions or rt of the max to form a max sum
        for(int i=0; i< a.length ; i++){
            if(a[i]==1){
                if(flag==0){
                    start = i;
                    flag =1;
                }
                count += 1;
            }
             if(max< count) {
                max = count;
                count =0;
                flag =0;
                stat = start;
                j=i-1;
            }
        }
        while(stat>0){
            if(a[stat-1]==0 && n>0){
                stat--;
                n--;
                max++;
            }else
                max++;
        }
        while(j<a.length){
            if(a[j+1]==0 && n>0){
                j++;
                n--;
                max++;
            }else
                max++;
        }
        System.out.println(max);
    }
}

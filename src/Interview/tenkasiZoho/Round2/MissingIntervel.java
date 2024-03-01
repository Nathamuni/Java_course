package Interview.tenkasiZoho.Round2;

public class MissingIntervel {
    public static void main(String[] args) {
        int a[] ={8,14,20,2,32,26,44};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //to find intervel
        for(int i : a){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }

        int inter = (max-min)/a.length;
        System.out.println("inter : "+inter);
        int flag=0;
        for(int i=0;i<a.length ;i++){

            for(int j=0;j<a.length ; j++){
                if(a[j]==min+inter && min <max)  flag =1;
            }

            if(flag ==1){
                flag=0; min+=inter;
            }else{
                System.out.println("Missing : "+(min+inter));
                return;
            }
        }

    }
}

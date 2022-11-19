package Interview.zoho;
/*Geek lost the password of his super locker. He remembers the number of digits N as well as the sum S of all the digits of his password. He know that his password is the largest number of N digits that can be made with given sum S. As he is busy doing his homework, help him retrieving his password.*/
public class LostPassword {
    public static void main(String[] args) {
        int n= 5,s=12;
        System.out.println( returnTheMaxNo(n,s));

    }

    private static long returnTheMaxNo(int n, int s) {
        //total digits = 5
        //total sum = 12
        String max="" ;
        int count=0;
        while (n>0){
            if ((s-count)>0 && count<9){
                count++;
            }
            else if(s==0){
                max+="0";
                n--;
            }
            else{
                String s1 =Integer.toString(count);
                max+=s1;
                s-=count;
                count=0;
                n--;
            }


        }
        return Long.valueOf(max);
    }


}

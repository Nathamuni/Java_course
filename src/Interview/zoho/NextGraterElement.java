package Interview.zoho;

public class NextGraterElement {

    static int a[]={1,33,2,54,43,2,5,7,34,9,5,35,3};
    public  static void main(String[] args) {
        int the_element =34;
        for(int i =0 ;i< a.length; i++){
            if(the_element == a[i]){ System.out.println(find_next_grater(i)); break;}
        }
    }
    public static int find_next_grater(int i){
        int max =-1;
        for(int j= i+1 ; j<a.length; j++ )
        {
            if (a[j]>a[i]){ max = a[j]; break;}
        }
        return max;
    }
}

package oncampusZOHO;

public class sqrNum {
    static int sqrt(int a){
        return a*a;
    }
    public static void main(String[] args) {
        int a = 20,b = 100;
        for(int i=1;i<= b;i++){
            if(sqrt(i)>a && sqrt(i)<=b)
                System.out.println(sqrt(i));
        }
    }


}

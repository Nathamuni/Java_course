package Interview.MallowTech;

public class NDistinctIntegers {
    public static void main(String[] args) {
        isIt(4);
    }

    public static void isIt(int n){
        //if(n==2) System.out.println(0+", "+n);
//        else if(n==3) System.out.println(1+", "+ -1 +", "+n);
//        else if(n==4) System.out.println(1+", "+ -1 +", "+ 0 +", "+n);


//        else{
            if(n%2==1){

                for(int i=1; i<=n/2; i++){
                    System.out.print(i);
                    System.out.print(", ");
                    System.out.print("-"+i);
                }
                System.out.print(", "+n);
            }
            else{
                System.out.print("0, ");
                for(int i=1; i<n/2; i++){
                    System.out.print(i);
                    System.out.print(", ");
                    System.out.print("-"+i+", ");
                }
                System.out.print(n);
            }
//        }
    }
}

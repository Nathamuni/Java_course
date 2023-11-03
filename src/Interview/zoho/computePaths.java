package Interview.zoho;

public class computePaths {
    public static void main(String[] args) {
        int n=3 ,m=3;
        System.out.println(findAllPaths(n,m));
    }

    private static int findAllPaths(int n, int m) {

        if(n==1 ||m==1) return 1;


        return findAllPaths(n-1,m) + findAllPaths(n,m-1);
    }
}

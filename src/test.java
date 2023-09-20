class a {
    static int sum = 0;


    public static int fact(int n, int g) {
        for(int i=5; i<= n; i++){
            System.out.println(g);
            if( g>1 && i % fact(n,g-1) ==0 ){
               sum += g;
           }

           if(sum==i && g==2) {
               return i;
           }
           if(g<=2) return 999999;

        }
        return 0;
    }


    public static void main(String[] args) {

        System.out.println(fact(100,100));


    }

}
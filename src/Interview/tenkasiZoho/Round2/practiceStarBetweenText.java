package Interview.tenkasiZoho.Round2;

public class practiceStarBetweenText {
    public static void main(String[] args) {
        String s ="i am good today";
        int len =  23;
//        System.out.println();
        SayMyName(len , s);
    }

    private static void SayMyName(int len, String s) {
        char ch[];
        int count=0;
        for(int i=0;i<s.length() ; i++){
            if(s.charAt(i) != ' ') count++;
        }
        System.out.println("count " + count);

        int starToBePrinted = len - count;

        int spacesAvail = s.length()-count;

        int StarOnEachSpace = (int)Math.ceil(1.0*starToBePrinted/spacesAvail);


        for(int i=0;i<s.length() ; i++){
            if(s.charAt(i) == ' '){
                if(starToBePrinted < StarOnEachSpace) StarOnEachSpace = starToBePrinted;
            for(int j=0; j<StarOnEachSpace ; j++){
                System.out.print("*");
            }
            starToBePrinted -= StarOnEachSpace;
        }else
            System.out.print(s.charAt(i));
        }
    }

}

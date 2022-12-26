package Interview.TCS;

public class ContiguousNumof1s {
    public static void main(String[] args) {
        String s =  "101011011101";
        int count=0,max=0;
        for(int i=0; i <s.length();i++) {
            if (s.charAt(i) == '1') {
                count += 1;
                max = Math.max(count, max);
            } else if (s.charAt(i) == '0') count = 0;
        }
        System.out.println(max);

    }
}

package Interview.zoho;

public class RedGreen {
    //https://practice.geeksforgeeks.org/problems/red-or-green5711/1
    public static void main(String[] args) {
        String s = "RGRRRGGGGRGRGGRGRGRG";
        String s1 = s.replaceAll("R", "");
        int GreenLength = s.length() - s1.length();
            System.out.println(Math.min(GreenLength,s.length() - GreenLength));
    }
}

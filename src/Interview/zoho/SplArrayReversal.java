package Interview.zoho;

public class SplArrayReversal {
    public static void main(String[] args) {
        System.out.println(reverse("\n" +
                "xzx(xdmke$mul(]imq]$zn$h`tzsnjt$qi$khz(\n"));
    }
    public static String reverse(String s)
    {

        char[] arr = s.toCharArray();
        // char[] output = new char[arr.length];
        String out="";
        int a =0,b= arr.length-1;
        char temp;
        while(a<b)
        {
            while(!((int)arr[a]>=65 && (int)arr[a]<=90 || (int)arr[a]>=97 && (int)arr[a]<=122))
            {
                // out+=Character.toString(arr[a]);
                a++;
            }

            while(!((int)arr[b]>=65 && (int)arr[b]<=90 || (int)arr[b]>=97 && (int)arr[b]<=122))
            {
                //out+=Character.toString(arr[b]);
                b--;
            }

            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            if(a<b){
                a++;
                b--;
            }

        }

        for(char c : arr){
            out+=c;
        }
        return out;
    }
}

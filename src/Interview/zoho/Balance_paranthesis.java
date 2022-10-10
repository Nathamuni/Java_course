package Interview.zoho;

public class Balance_paranthesis {

    static char[] stack = new char[50] ;

    static int top =-1;
    public static void main(String[] args) {
         String s = "({})[()]";
        char[] arr = s.toCharArray();
        System.out.println(stack);
        push(arr[0]);
        int i=1;
        while(top !=-1)

            if(stack[top] == '(' && arr[i] == ')' || stack[top] == '{' && arr[i] == '}' || stack[top] == '[' && arr[i] == ']' ){
                pop();
                i+=1;
            }

            else push(arr[i++]);
        }



    public static void push(char c){
        top+=1;
        stack[top] = c;
    }
    public static void pop(){
        top-=1;
    }
}

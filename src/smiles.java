import java.util.*;
class temp {
    ArrayList<Integer> stack = new ArrayList<>();// to note bracket index
    HashMap<Integer,Integer> hs = new HashMap<>();
    //index ,prevoius & next element
    public static void main(String args[]){
        String sb = "NC(C)C(O)O";
        //           012345678910
        char[] ch = sb.toCharArray();
        //obj creation
        temp t = new temp();
        t.nestedBracket(ch);
        t.print();

    }

    public  void nestedBracket(char ch[]){
        for(int i =0;i<ch.length;i++){
            if(ch[i]=='(') {
                hs.put(i+1,i-1);
             //   hs.put(i-1,i+1);-----------------since in HM it will not allow duplicate keys
                stack.add(i);

            }
            else if(ch[i]==')'){
                int size =(stack.get(stack.size()-1));
                //this is a if condition
                //V

                while(ch[i]==')') {
                    if((stack.size()-1) - (stack.size()-2)==1) size--;
                    i++;
                }
                hs.put(size-1,i);
            }
            else {
                if(i==0 && ch[i+1] !='(')
                    hs.put(i,i+1);
                else if(ch[i+1] =='('){
                    //   while(ch[i+1] != 'c')i++;
//                    while(ch[i-1] =='(') i--;

                  //  hs.put(i,i+2);-----------------since in HM it will not allow duplicate keys
                    hs.put(i+2,i);//had to do when i-1 not a '('


                }
                else if (ch[i+1] ==')'){
                    hs.put(i,i-1);
                }
                else if(ch[i-1] !='(' ){

                    hs.put(i,i-1);
                    hs.put(i,i+2);
                }
            }
        }

    }

    public void print(){

        System.out.println(hs.keySet());
        System.out.println(hs.values());
    }

}
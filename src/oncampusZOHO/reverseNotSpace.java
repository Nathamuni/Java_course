package oncampusZOHO;

public class reverseNotSpace {
    public static void main(String[] args) {
        String s = "y kse, ht ni3 21ee slsy : a sta o-b-e ht nin amA";
        IdoItForYou(s);
    }

    private static void IdoItForYou(String s) {
        int i = 0, j= s.length()-1;
        char c[] = s.toCharArray();
        while(i<j){
            while(c[i]== ' '|| c[i]== ','|| c[i]== ':'|| c[i]== '-'){


                i++;
            }
            while(c[j]== ' '|| c[j]== ','|| c[j]== ':'|| c[j]== '-'){

                j--;
            }
            char ch = c[i];
            c[i]= c[j];
            c[j]= ch;
            i++;j--;
        }
        for (char ch :c
             ) {
            System.out.print(ch);
        }
    }


}

package TestMyself;

public class prob19 {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if (s1==s2)
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");
        /*
        Here we are using new keyword which creates two different objs(s1,s2)
        When we use == operator it will compare the address of those two instances
        which is different on the ram.[two different objs with same values are not equal]
        */
        // if we wanna check the values  we can use
        // if(s1.equals(s2)) then we get _ They are equal.

    }
}

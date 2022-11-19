package TestMyself;

public class prob5 {

    public void PrintStringData(Object obj){  // Object datatype is used when we don't know what DT the variable might point to
        System.out.println("Method within OBJECT is called");
    }

    public void PrintStringData(String str){ // Specific DT
        System.out.println("Method within STRING is called ");
    }

    public static void main(String[] args) {

        prob5 C = new prob5();
        C.PrintStringData(null);
    }

}

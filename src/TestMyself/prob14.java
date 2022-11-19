//  Write a java program which should call main method TWICE..!
package TestMyself;

public class prob14 {
    static { //SIB (static initialisation block)
        main(null);
    }
    // what happens is since static method have high priority it will execute first
    //which calls main() ,since arg to be passed we instantiate null
    public static void main(String[] args) {
        System.out.println("Call me twice..!");
    }

}

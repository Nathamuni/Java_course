package TestMyself;

public class prob6 {

    public static void printData(){
        System.out.println("Inside  printData..!");
    }
// will I get Exception... internally Static method is directly called [prob6.printData();]
    public static void main(String[] args) {
        prob6 p6 = null;
        p6.printData();
//  Since static method do not require any obj it will execute


    }
}

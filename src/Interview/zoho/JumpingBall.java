package Interview.zoho;

public class JumpingBall {
    //a ball thrown up height h calculate the total distance travelled if it bounce back half the height
    public static void main(String[] args) {
        int h = 10;
        System.out.println(jumpLength(h));
    }

    private static int jumpLength(int h) {
        //until h =0 we perform devision  to 1/2
        int out = 0;
        while (h != 0) {
            out += h;
            h /= 2;
        }
        return out * 2;
    }
}

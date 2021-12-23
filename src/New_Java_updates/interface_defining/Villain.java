package New_Java_updates.interface_defining;

public class Villain implements Actor{

    @Override
    public void act() {
        System.out.println("Villain can act..!");
    }

    @Override
    public void speak() {
        System.out.println("Villain can speak..!");
    }

    public static void main(String[] args) {
        Villain v = new Villain();
        v.comedy();
    }
}

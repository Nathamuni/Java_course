package New_Java_updates.interface_defining;

public class Hero implements Actor{

    @Override
    public void act() {
        System.out.println("Hero can act..!");
    }

    @Override
    public void speak() {
        System.out.println("Hero can speak..!");
    }
    public void comedy(){
        System.out.println("Hero can make comedy..!");
    }   // I already have this method.

    public static void main(String[] args) {
        Hero h = new Hero();
        h.comedy();
    }
}

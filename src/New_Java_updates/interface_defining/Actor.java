package New_Java_updates.interface_defining;

public interface Actor {

    void speak();
    void act();
// ^ are existing method declaration

    default void comedy()  // If i modify the interface it would give me an error
    {                     // to resolve this i can define a method using default
        System.out.println("I can make ppl laugh");
    }
// used for those class that implements this if they don't have one it will provide one
}

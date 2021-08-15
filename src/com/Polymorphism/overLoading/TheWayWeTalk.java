package com.Polymorphism.overLoading;

public class TheWayWeTalk { // Main class (parent)

    //Here same method talk() is used with different parameters(datatype(classes))

    public void talk(parent styleOfTalking)
    {
        System.out.println("Polite, Respectful");
        System.out.println(parent.a);
    }
    private void talk(partner styleOfTalking){
        System.out.println("Love, Romantic..!");
    }
    public void talk(boss styleOfTalking)
    {
        System.out.println("Nothing personal , strictly business");
    }

    public static void main(String[] args) {
        TheWayWeTalk talk = new TheWayWeTalk();
        parent parents = new parent();
        talk.talk(parents); // here parent datatype ulla talk fun a call pannum
        partner partner = new partner();
        talk.talk(partner);//It knows where to bind with respect to its parameter before compile_time(EarlyBinding)
        boss boss = new boss();
        talk.talk(boss);
    }
}

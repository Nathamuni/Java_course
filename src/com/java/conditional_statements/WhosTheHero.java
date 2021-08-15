package com.java.conditional_statements;

public class WhosTheHero {
   protected String myheroname = "Super man";
    public void SuperHeroGuesser(){
        if(myheroname.equals("Iron Man"))
            System.out.printf("You thought of ironman");
        else if(myheroname.equalsIgnoreCase("Super Man"))
            System.out.printf("You thought of Super man");
        else if(myheroname.equals("Thor"))
            System.out.printf("You thought of Thor");
        else
            System.out.printf("I don't know..!");
    }

    public static void main(String[] args) {
        WhosTheHero heroname = new WhosTheHero();
        heroname.SuperHeroGuesser();
    }
}

package com.java.conditional_statements;


public class Switch {
    String hero = "Nathamuni";
    public  void heroOrNot(){

        switch (hero){
            case "Captain America":
                System.out.printf("Captain America is a super hero");
                break;
            case "Iron Man":
                System.out.printf(hero+" is a super hero");
                break;
            case  "Nathamuni":
                System.out.printf(hero +" is always a super hero");
                break;
            default:
                System.out.printf("Sorry I dont have any idea..!");
        }

    }

    public static void main(String[] args) {
        Switch checkHero = new Switch();
        checkHero.heroOrNot();
    }
}

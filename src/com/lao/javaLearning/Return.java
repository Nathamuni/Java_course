package com.lao.javaLearning;

public class Return {
    public Integer CollectedAmount = 1000;

    public int collectamountandgiveittome(){
        System.out.println("I have collected the amount "+ CollectedAmount +" and send it 2U");

        return CollectedAmount;
    }
    public static void main(String[] args)
    {
        Return myboy = new Return();
        int amount = myboy.collectamountandgiveittome();
        System.out.println("Got the amount "+amount);
    }

}

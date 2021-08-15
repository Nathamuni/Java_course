package com.Loop;


public class Loop {

    public static void main(String[] args) {

        for(int times = 0 ; times<5 ; times++)
            System.out.printf("I can learn Programming \n");

        int a =0;
        //  While is ENTRY CONTROLLED LOOP
        while(a<5){
            System.out.printf("Its very easy\n");
            a++;
        }

        int i=0;
        // do while is EXIT CONTROLLED LOOP
        do {
            System.out.printf("No one can stop me from learning it\n");

            i++;
        }while (i<5);
    }
}

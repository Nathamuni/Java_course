package com.javaLearning;

public class main {


        long accountNumber = 1234567890l; //primitive datatype
        String holderName = "Nathamuni"; //wrapper class
        Integer accountBalance = 390;

        public void getBalance() {
            System.out.println("Balance is " + accountBalance);
        }

        public static void main(String[] args) {
            main account = new main();
            account.getBalance();
            System.out.println("Your account holder Name is "+account.holderName);
            System.out.println("Your account number is "+account.accountNumber);
        }
    }


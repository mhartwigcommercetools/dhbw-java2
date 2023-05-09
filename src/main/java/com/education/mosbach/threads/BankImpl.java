package com.education.mosbach.threads;

import java.util.Random;

public class BankImpl {

    static int[] accounts = {1000, 1000, 1000};
    static int LIMIT_TRANSFERS = 1_000_000;
    static int LIMIT_REPORTS = 1_000;

    public static class AccountManager implements Runnable {
        Random random = new Random();
        @Override
        public void run() {
            for (int i = 0; i < LIMIT_TRANSFERS; i++) {
                int temp = random.nextInt(500);
                synchronized (accounts) {
                    accounts[random.nextInt(3)] += temp;
                    accounts[random.nextInt(3)] -= temp;
                }
            }
        }
    }

    public static class AccountPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < LIMIT_REPORTS; i++) {
                int sum = 0;
                System.out.println();
                synchronized (accounts) {
                    System.out.println("Account 1 = " + accounts[0]);
                    sum += accounts[0];
                    System.out.println("Account 2 = " + accounts[1]);
                    sum += accounts[1];
                    System.out.println("Account 3 = " + accounts[2]);
                    sum += accounts[2];
                }
                System.out.println("Summe = " + sum);
            }
        }
    }

    public static void main(String[] args) {

        Thread printer = new Thread(new AccountPrinter());
        Thread accountManager1 = new Thread(new AccountManager());
        Thread accountManager2 = new Thread(new AccountManager());
        printer.start();
        accountManager1.start();
        accountManager2.start();


        try {
            printer.join();
            accountManager1.join();
            accountManager2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

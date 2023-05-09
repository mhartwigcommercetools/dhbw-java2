package com.education.mosbach.threads;

import java.util.Random;

public class DummyThreadCounterPlay {


    public static void main(String[] args) {

        final int LIMIT = 300_000_000;
        int[] numbers = new int[LIMIT];
        Random random = new Random();
        for (int i = 0; i < LIMIT; i++) {
            numbers[i] = random.nextInt(100);
        };

        long beforeSingleThread = System.currentTimeMillis();
        int counterMod3 = 0;
        for (int i = 0; i < LIMIT; i++) {
            if (numbers[i] % 3 == 0) counterMod3++;
        }
        long afterSingleThread = System.currentTimeMillis();

        Thread thread1 = new Thread(new ModThreeCounterThread(0, 100_000_000, numbers));
        Thread thread2 = new Thread(new ModThreeCounterThread(100_000_001, 200_000_000, numbers));
        Thread thread3 = new Thread(new ModThreeCounterThread(200_000_001, 299_999_999, numbers));

        long beforeThreeThread = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long afterThreeThread = System.currentTimeMillis();

        // Wer gewinnt?
        System.out.println("Counter Competition");
        System.out.println("===================================");
        System.out.println("1 Thread = " + (afterSingleThread-beforeSingleThread));
        System.out.println("3 Threads = " + (afterThreeThread-beforeThreeThread));

        // Optimieren

    }
}

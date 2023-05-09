package com.education.mosbach.threads;

public class ModThreeCounterThread implements Runnable {

    private int begin;
    private int end;
    private int[] numbers;

    public ModThreeCounterThread(int begin, int end, int[] numbers) {
        this.begin = begin;
        this.end = end;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int counterMod3 = 0;
        for (int i = begin; i <= end; i++) {
            if (numbers[i] % 3 == 0) counterMod3++;
        }
    }
}

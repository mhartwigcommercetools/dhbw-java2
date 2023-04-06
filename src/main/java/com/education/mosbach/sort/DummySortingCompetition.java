package com.education.mosbach.sort;

import com.education.mosbach.sort.impl.BubbleSort;
import com.education.mosbach.sort.impl.BubbleSortImproved;
import com.education.mosbach.sort.impl.QuickSort;

import java.util.Random;

public class DummySortingCompetition {


    public static void main(String[] args) {

        final int LIMIT = 200_000;

        Random random = new Random();
        int[] randomIntsBS = new int[LIMIT];
        int[] randomIntsBSImproved = new int[LIMIT];
        int[] randomIntsQS = new int[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            int temp = random.nextInt();
            randomIntsBS[i] = temp;
            randomIntsBSImproved[i] = temp;
            randomIntsQS[i] = temp;
        }

        long BS_before = System.currentTimeMillis();
        (new BubbleSort())
                .sort(randomIntsBS);
        long BS_after = System.currentTimeMillis();

        long BSImproved_before = System.currentTimeMillis();
        (new BubbleSortImproved())
                .sort(randomIntsBSImproved);
        long BSImproved_after = System.currentTimeMillis();

        long QS_before = System.currentTimeMillis();
        (new QuickSort())
                .sort(randomIntsQS);
        long QS_after = System.currentTimeMillis();

        System.out.println("Sorting competition results:");
        System.out.println("=========================================");
        System.out.println("BubbleSort: " + (BS_after - BS_before) + "msec");
        System.out.println("BubbleSortImproved: " + (BSImproved_after - BSImproved_before) + "msec");
        System.out.println("QuickSort: " + (QS_after - QS_before) + "msec");


        // sortiere mit BS, BSImproved, QS

        // miss die Zeit

        // Wer gewinnt?

    }
}

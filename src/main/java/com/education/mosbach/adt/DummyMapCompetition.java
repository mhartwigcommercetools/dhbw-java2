package com.education.mosbach.adt;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

public class DummyMapCompetition {

    // zwei Maps mal erstellen und mit Random füllen
    // einmal Hashmap, einmal eine andere

    // jetzt ganz oft suchen, mal sehen, wer schneller ist

    public static void main(String[] args) {

        final int LIMIT = 30_000_000;
        Map<Integer, String> mySlowMap = new WeakHashMap<>();
        Map<Integer, String> myFastMap = new HashMap<>();
        Random myRandom = new Random();

        for (int i = 0; i < LIMIT; i++) {
            int tempInt = myRandom.nextInt();
            String tempString = "tata" + tempInt;
            myFastMap.put(tempInt, tempString);
            mySlowMap.put(tempInt, tempString);
        }

        long before_weak = System.currentTimeMillis();
        for (int i = 0; i < LIMIT; i++) {
            int tempInt = myRandom.nextInt();
            mySlowMap.containsKey(tempInt);
        }
        long after_weak = System.currentTimeMillis();

        long before_fast = System.currentTimeMillis();
        for (int i = 0; i < LIMIT; i++) {
            int tempInt = myRandom.nextInt();
            myFastMap.containsKey(tempInt);
        }
        long after_fast = System.currentTimeMillis();

        System.out.println("Competition");
        System.out.println("===============================");
        System.out.println("Weak Hashmap needs " + (after_weak-before_weak));
        System.out.println("Strong Hashmap needs " + (after_fast-before_fast));
    }

}

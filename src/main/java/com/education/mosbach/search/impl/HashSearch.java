package com.education.mosbach.search.impl;

import com.education.mosbach.search.api.IntFinder;

public class HashSearch implements IntFinder {
    @Override
    public boolean search(int[] ints, int element) {

        // alle Elemente in den Hashspeicher mit einer Hashfunktion
        // Hashfunktion ist: h(x) = x % 100

        int[] hashStorage = new int[100];
        for (int i = 0; i < hashStorage.length; i++)
            hashStorage[i] = -1;

        for (int e : ints) {
            int pos = e % 100;
            hashStorage[pos] = e;
        }

        // super schnell checken

        return false;
    }




    @Override
    public boolean logsearch(int[] sortedInts, int posleft, int posright, int element) {
        return false;
    }
}
